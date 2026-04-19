import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    @Override
    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }

}

class Kruskal {
    static int[] parents;

    static int find(int x) {
        if (parents[x] == x) {
            return x;
        }
        return parents[x] = find(parents[x]);
    }

    static void union(int x, int v) {
        int px = find(x);
        int pv = find(v);

        parents[px] = pv;
    }

    static void KruskalMST(List<Edge> edges, int v) {
        Collections.sort(edges);

        parents = new int[v];

        for (int i = 0; i < v; i++) {
            parents[i] = i;
        }

        int count = 0;
        int totalWeight = 0;

        for (Edge edge : edges) {
            if (find(edge.src) != find(edge.dest)) {
                union(edge.src, edge.dest);

                System.out.println(edge.src + " - " + edge.dest + " -: " + edge.weight);

                totalWeight += edge.weight;
                count++;
            }

            if (count == v - 1) {
                break;
            }
        }

        System.out.println("Total Weight: " + totalWeight);

    }
}

public class KruskalAlgo {

    public static void main(String[] args) {
        int v = 4;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 1));
        edges.add(new Edge(0, 2, 3));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 4));
        edges.add(new Edge(2, 3, 5));


        // Kruskal klgo = new Kruskal();
        Kruskal.KruskalMST(edges, v);
    }
}