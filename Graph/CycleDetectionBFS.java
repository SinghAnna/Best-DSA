import java.util.*;

public class CycleDetectionBFS {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    static boolean bfs(int start,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();

        visited[start] = true;
        q.offer(new Pair(start, -1));

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int node = curr.node;
            int parent = curr.parent;

            for (int nei : adj.get(node)) {

                // not visited
                if (!visited[nei]) {

                    visited[nei] = true;
                    q.offer(new Pair(nei, node));

                }
                // visited and not parent
                else if (nei != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];

        // disconnected graph handle
        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (bfs(i, adj, visited)) {
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