import java.util.*;

public class BFS {
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
        // graph[0].add(new Edge(0,2,4));
        // graph[0].add(new Edge(0,3,10));
        // graph[1].add(new Edge(1,0,5));
        // graph[2].add(new Edge(2,1,12));
        // graph[3].add(new Edge(3,4,9));
        // graph[4].add(new Edge(4,0,1));

        // undirected graph
        graph[0].add(new Edge(0,1,4));
        graph[0].add(new Edge(0,2,10));
        graph[0].add(new Edge(0,3,4));
        graph[1].add(new Edge(1,0,4));
        graph[1].add(new Edge(1,2,6));
        graph[2].add(new Edge(2,1,6));
        graph[2].add(new Edge(2,0,10));
        graph[3].add(new Edge(3,0,4));
        graph[3].add(new Edge(3,4,1));
        graph[4].add(new Edge(4,3,1));

        return graph;
    }

    public static void bfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]){
        // queue (FIFO) - to process all the neighbors of the current node before moving to the next elvel
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);

        while(!q.isEmpty()){
            curr = q.remove();
            if(!vis[curr]){
                // visit the node if not already visited and add all its neighbors to the queue
                vis[curr] = true;
                System.out.print(curr + " ");
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, i, vis);
            }
        }
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        bfs(graph);
    }
}
