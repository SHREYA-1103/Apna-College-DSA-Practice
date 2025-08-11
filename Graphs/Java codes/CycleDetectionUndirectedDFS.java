import java.util.*;

public class CycleDetectionUndirectedDFS {
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

        // undirected graph
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

    public static boolean dfsUtil(ArrayList<Edge> graph[], int curr, int par, boolean vis[]){

        vis[curr] = true;
        
        // process all the levels that can be reached from the current node before processing the other neighbors at the same level
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                // return true if any neighbor detects a cycle
                if(dfsUtil(graph, e.dest, curr, vis)){
                    return true;
                }
            }
            // return true if the neighbor has been visited through some other path
            else if(e.dest != par){
                return true;
            }
        }

        return false;
    }

    public static boolean hasCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i< graph.length; i++){
            if(!vis[i] && dfsUtil(graph, i, -1, vis)){
                return true;
            }
        }

        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        System.out.println(hasCycle(graph));
    }
}
