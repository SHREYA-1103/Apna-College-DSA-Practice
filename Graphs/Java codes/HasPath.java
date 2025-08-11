import java.util.*;

public class HasPath {

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

    public static boolean dfsUtil(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }

        vis[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            // if current node is not the dest but any of its neighbors has path to dest - return true
            if(!vis[e.dest] && dfsUtil(graph, e.dest, dest, vis)){
                return true;
            }
        }

        return false;

    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest){

        if(src == dest){
            return true;
        }

        boolean vis[] =  new boolean[graph.length];

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && dfsUtil(graph, e.dest, dest, vis)){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge> graph[] = createGraph(V);

        System.out.println(hasPath(graph, 2, 4));

    }
}
