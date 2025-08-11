import java.util.*;

public class CycleDetectionDirectedDFS {
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

        // directed graph
        graph[0].add(new Edge(0,2,4));
        graph[0].add(new Edge(0,3,10));
        graph[1].add(new Edge(1,0,5));
        graph[2].add(new Edge(2,1,12));
        graph[3].add(new Edge(3,4,9));
        graph[4].add(new Edge(4,0,1));

        return graph;
    }

    public static boolean dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;
        
        // process all the levels that can be reached from the current node before processing the other neighbors at the same level
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // if already visited in the current iteration - cycle exists
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest]){
                if(dfsUtil(graph, e.dest, vis, stack)){
                    return true;
                }
            }
        }

        // reset for the next iteration
        stack[curr] = false;

        return false;
    }

    public static boolean hasCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                if(dfsUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }

        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        System.out.println(hasCycle(graph));
    }
}
