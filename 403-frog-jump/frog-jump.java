class Solution {

    public boolean helper(int pos, int k, int[] stones,
                          HashMap<Integer,Integer> map,
                          boolean[][] dp,
                          boolean[][] visited) {

        if(pos == stones.length - 1) return true;

        if(visited[pos][k]) return dp[pos][k];

        visited[pos][k] = true;

        for(int i = k-1; i <= k+1; i++) {

            if(i > 0 && map.containsKey(stones[pos] + i)) {

                int newPos = map.get(stones[pos] + i);

                if(helper(newPos, i, stones, map, dp, visited)) {
                    dp[pos][k] = true;
                    return true;
                }
            }
        }

        dp[pos][k] = false;
        return false;
    }

    public boolean canCross(int[] stones) {

        int n = stones.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(stones[i], i);

        boolean[][] dp = new boolean[n][n+1];
        boolean[][] visited = new boolean[n][n+1];

        return helper(0, 0, stones, map, dp, visited);
    }
}