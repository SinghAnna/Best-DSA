import java.util.*;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int neigh : adj.get(i)) {
                System.out.print(neigh + " ");
            }
            System.out.println();
        }
    }

    void bfs(int start) {

        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int nbr : adj.get(node)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
    }

    // void bfsUitl(int node, boolean[] visited){

    //     visited[node] = true;
    //     System.out.print(node + " ");

    //     for (int nbr : adj.get(node)) {
    //         if (!visited[nbr]) {
    //             bfsUitl(nbr, visited);
    //         }
    //     }
    // }

    // void bfsRecursion(int start){
    //     boolean[] visited = new boolean[V];
    //     bfsUitl(start, visited);
    // }
}

public class BFS {

    public static void main(String[] args) {
        Graph g1 = new Graph(4);

        g1.addEdge(0, 1);
        g1.addEdge(0, 3);
        g1.addEdge(2, 0);
        g1.addEdge(2, 3);
        g1.addEdge(3, 1);

        // g1.printGraph();

       g1.bfs(2);

        //g1.bfsRecursion(2);


    }
}
