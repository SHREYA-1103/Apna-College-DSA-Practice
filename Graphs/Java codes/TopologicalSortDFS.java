import java.util.*;

public class TopologicalSortDFS {
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

        // directed acyclic graph
        graph[2].add(new Edge(2,0,4));
        graph[0].add(new Edge(0,3,10));
        graph[1].add(new Edge(1,0,5));
        graph[2].add(new Edge(2,1,12));
        graph[3].add(new Edge(3,4,9));

        return graph;
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){

        vis[curr] = true;
        
        // process all the levels that can be reached from the current node before processing the other neighbors at the same level
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                dfsUtil(graph, i, vis, s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        topSort(graph);
    }
}
