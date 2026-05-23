import java.util.*;

public class CycleDetectionUndirected {

    static boolean dfs(int node, int parent,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {

        visited[node] = true;

        for (int nei : adj.get(node)) {

            // not visited
            if (!visited[nei]) {

                if (dfs(nei, node, adj, visited)) {
                    return true;
                }

            }
            // visited and not parent -> cycle
            else if (nei != parent) {
                return true;
            }
        }

        return false;
    }

    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];

        // disconnected graph handle
        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (dfs(i, -1, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1);
        adj.get(1).add(3);

        System.out.println(isCycle(V, adj)); // true
    }
}