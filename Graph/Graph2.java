import java.util.ArrayList;


public class Graph2 {

     int V;
    ArrayList<ArrayList<Integer>> adj;


    Graph2(int V){

        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

    }

    void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printGraph(){
        for (int i = 0; i < V; i++) {
            System.out.println(i  + " -> " +adj.get(i));
        }
    }


    public static void main(String[] args) {
        Graph2 g1 = new Graph2(3);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);

        g1.printGraph();
    }
}
