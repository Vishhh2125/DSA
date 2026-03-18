class Solution {

    public int helper(int[] coins, int rem, int i, int[][] dp) {

        if (rem == 0) return 1;
        if (i == coins.length) return 0;

        if (dp[i][rem] != -1) return dp[i][rem];

        int take = 0;
        if (coins[i] <= rem) {
            take = helper(coins, rem - coins[i], i, dp); // same index
        }

        int skip = helper(coins, rem, i + 1, dp); // move forward

        return dp[i][rem] = take + skip;
    }

    public int change(int amount, int[] coins) {

        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(coins, amount, 0, dp);
    }
}