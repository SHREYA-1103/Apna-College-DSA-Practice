import java.util.*;

public class TopologicalSortKahnsAlgorithm {
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

    public static void dfsUtil(ArrayList<Edge> graph[], boolean vis[], Queue<Integer> q, int indegree[]){
        
        // process all the levels that can be reached from the current node before processing the other neighbors at the same level
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                vis[curr] = true;
                System.out.print(curr + " ");
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    indegree[e.dest]--;
                    if(indegree[e.dest] == 0){
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    public static int[] findIndegree(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];

        for (ArrayList<Edge> graph1 : graph) {
            for (int j = 0; j < graph1.size(); j++) {
                Edge e = graph1.get(j);
                indeg[e.dest]++;
            }
        }

        return indeg;
    }

    public static void KahnsAlgo(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        // calculate indegree of each node
        int indegree[] = findIndegree(graph);
        
        Queue<Integer> q = new LinkedList<>();

        // add nodes with 0 in degree to the queue for first retrieval (min dependency)
        for(int i=0; i<graph.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                dfsUtil(graph, vis, q, indegree);
            }
        }
    }
    
    public static void main(String args[]){
        ArrayList<Edge> graph[] = createGraph(5);

        KahnsAlgo(graph);
    }
}
