import java.util.*;

public class IsBipartite {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static ArrayList<Edge>[] createGraph(int V){
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        // undirected graph - bipartite
        graph[0].add(new Edge(0,1,4));
        graph[0].add(new Edge(0,2,10));
        graph[0].add(new Edge(0,3,4));
        graph[1].add(new Edge(1,0,4));
        graph[2].add(new Edge(2,0,10));
        graph[3].add(new Edge(3,0,4));
        graph[3].add(new Edge(3,4,1));
        graph[4].add(new Edge(4,3,1));

        return graph;
    }

    public static boolean dfsUtil(ArrayList<Edge> graph[], int curr, int orig, boolean vis[], int color[]){
        
        vis[curr] = true;

        // process all the levels that can be reached from the current node before processing the other neighbors at the same level
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                color[e.dest] = 1-orig;
                if(!dfsUtil(graph, e.dest, 1-orig, vis, color)){
                    return false;
                }
            }
            else{
                if(color[e.dest] == orig){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        // use graph coloring concept using only two colors to find if its vertices can be divided into sets
        int color[] = new int[graph.length];

        Arrays.fill(color, -1);

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                color[i] = 0;
                if(!dfsUtil(graph, i, 0, vis, color)){
                    return false;
                }
            }
        }

        return true;
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        System.out.println(isBipartite(graph));
    }
}
