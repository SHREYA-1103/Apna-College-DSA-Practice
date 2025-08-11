import java.util.*;

public class CountConnectedComponents {
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

        // directed graph -- 3 connected components
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,0,5));
        graph[2].add(new Edge(2,1,12));

        // undirected graph -- 2 connected components
        // graph[0].add(new Edge(0,1,4));
        // graph[0].add(new Edge(0,2,10));
        // graph[1].add(new Edge(1,0,4));
        // graph[1].add(new Edge(1,2,6));
        // graph[2].add(new Edge(2,1,6));
        // graph[2].add(new Edge(2,0,10));
        // graph[3].add(new Edge(3,4,1));
        // graph[4].add(new Edge(4,3,1));

        return graph;
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]){

        vis[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static int dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        int count = 0;

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                // increase the count everytime we have to run dfs again to iterate through all the nodes of the graph - all the connected nodes can be covered in one traversal
                count ++;
                dfsUtil(graph, i, vis);
            }
        }

        return count;
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        System.out.println(dfs(graph));
    }
}
