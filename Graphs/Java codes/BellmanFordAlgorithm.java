import java.util.*;

public class BellmanFordAlgorithm {
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

        // undirected graph -- graph with negative cycle
        // graph[0].add(new Edge(0,1,-4));
        // graph[0].add(new Edge(0,2,-10));
        // graph[0].add(new Edge(0,3,-4));
        // graph[1].add(new Edge(1,0,-4));
        // graph[1].add(new Edge(1,2,-6));
        // graph[2].add(new Edge(2,1,-6));
        // graph[2].add(new Edge(2,0,-10));
        // graph[3].add(new Edge(3,0,-4));
        // graph[3].add(new Edge(3,4,-1));
        // graph[4].add(new Edge(4,3,-1));

        return graph;
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src, int dist[]){
        dist[src] = 0;

        for(int i=0; i< graph.length-1; i++){
            int countUpdates = 0;
            for (ArrayList<Edge> graph1 : graph) {
                for (int k = 0; k < graph1.size(); k++) {
                    Edge e = graph1.get(k);
                    if(dist[e.src] != Integer.MAX_VALUE && dist[e.dest] > dist[e.src]+e.wt){
                        countUpdates++;
                        dist[e.dest] = dist[e.src] + e.wt;
                    }
                }
            }
            if(countUpdates == 0){
                break;
            }
        }

        int countUpdates = 0;
        for (ArrayList<Edge> graph1 : graph) {
            for (int k = 0; k < graph1.size(); k++) {
                Edge e = graph1.get(k);
                if(dist[e.src] != Integer.MAX_VALUE && dist[e.dest] > dist[e.src]+e.wt){
                    countUpdates++;
                    dist[e.dest] = dist[e.src] + e.wt;
                }
            }
        }
        if(countUpdates != 0){
            System.out.println("The graph has negative cycle");
            return;
        }

        System.out.println("Distance of all nodes from " + src + ":");
        for(int i=0; i<graph.length; i++){
            System.out.println(src + " to " + i + " --- " + dist[i]);
        }
    }
    
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge> graph[] = createGraph(V);
        int src = 0;

        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        bellmanFord(graph, src, dist);
    }
}
