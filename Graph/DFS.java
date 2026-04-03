import java.util.ArrayList;

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
   
    if (!adj.get(u).contains(v)) {
        adj.get(u).add(v);
    }
    if (!adj.get(v).contains(u)) {
        adj.get(v).add(u);
    }
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

}

public class DFS {
    public static void main(String[] args) {

        Graph g1 = new Graph(4);

        g1.addEdge(0, 1);
        g1.addEdge(0, 3);
        g1.addEdge(2, 0);
        g1.addEdge(2, 3);
        g1.addEdge(3, 1);
        g1.addEdge(3, 0);

        g1.printGraph();
        
    }
}
