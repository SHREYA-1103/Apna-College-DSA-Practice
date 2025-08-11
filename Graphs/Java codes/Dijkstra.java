import java.util.*;

public class Dijkstra {
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

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
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

        // undirected graph
        // graph[0].add(new Edge(0,1,4));
        // graph[0].add(new Edge(0,2,10));
        // graph[0].add(new Edge(0,3,4));
        // graph[1].add(new Edge(1,0,4));
        // graph[1].add(new Edge(1,2,6));
        // graph[2].add(new Edge(2,1,6));
        // graph[2].add(new Edge(2,0,10));
        // graph[3].add(new Edge(3,0,4));
        // graph[3].add(new Edge(3,4,1));
        // graph[4].add(new Edge(4,3,1));

        return graph;
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src, int dist[]){
        boolean vis[] = new boolean[graph.length];

        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            
            if(!vis[curr.node]){
                vis[curr.node] = true;
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(dist[e.src] != Integer.MAX_VALUE && dist[e.dest] > dist[e.src]+e.wt){
                        dist[e.dest] = dist[e.src]+e.wt;
                        pq.add(new Pair(e.dest, dist[e.dest]));
                    }
                }
            }
        }
    }
    
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge> graph[] = createGraph(V);

        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        int src = 0;

        dijkstra(graph, src, dist);

        System.out.println("Distance of all other nodes from " + src);
        for(int i=0; i<V; i++){
            System.out.println(src + " to " + i + " --- " + dist[i]);
        }
    }
}
