class Solution {

    public int helper(int[] coins, int rem, int start, int[][] dp) {

        if (rem == 0) return 1;
        if (rem < 0) return 0;

        if (dp[start][rem] != -1) return dp[start][rem];

        int count = 0;

        for (int i = start; i < coins.length; i++) {
            count += helper(coins, rem - coins[i], i, dp); // use i
        }

        return dp[start][rem] = count;
    }

    // ✅ correct function name for THIS logic
    public int change(int amount, int[] coins) {

        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(coins, amount, 0, dp);
    }
}