class Solution {

    int helper(int[] coins, int rem, int[] dp) {
    if (rem == 0) return 0;
    if (rem < 0) return (int)1e9;

    if (dp[rem] != -1) return dp[rem];

    int min = (int)1e9;

    for (int coin : coins) {
        int res = helper(coins, rem - coin, dp);
        min = Math.min(min, 1 + res);
    }

    return dp[rem] = min;
}
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = helper(coins, amount, dp);

        return ans >= (int)1e9 ? -1 : ans;
    }
}