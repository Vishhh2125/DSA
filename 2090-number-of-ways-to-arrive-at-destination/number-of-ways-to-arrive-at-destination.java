class Solution {
    public int countPaths(int n, int[][] roads) {

        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int w = road[2];

            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        long[] dist = new long[n];
        long[] count = new long[n];

        Arrays.fill(dist, Long.MAX_VALUE);

        int MOD = 1_000_000_007;

        PriorityQueue<long[]> pq =
            new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));

        dist[0] = 0;
        count[0] = 1;

        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {

            long[] top = pq.poll();

            int u = (int) top[0];
            long d = top[1];

            if (d > dist[u]) continue;

            for (int[] nbr : adj.get(u)) {

                int v = nbr[0];
                long newDist = d + nbr[1];

                if (newDist < dist[v]) {

                    dist[v] = newDist;
                    count[v] = count[u];

                    pq.offer(new long[]{v, newDist});
                }
                else if (newDist == dist[v]) {

                    count[v] = (count[v] + count[u]) % MOD;
                }
            }
        }

        return (int) count[n - 1];
    }
}