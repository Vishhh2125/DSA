class Solution {

    int helper(int[] heights, int i, int[] dp) {

        if (i >= heights.length - 1) return 0;

        if (dp[i] != -1) return dp[i];

        int oneStep = Math.abs(heights[i] - heights[i + 1])
                      + helper(heights, i + 1, dp);

        int twoStep = Integer.MAX_VALUE;
        if (i + 2 < heights.length) {
            twoStep = Math.abs(heights[i] - heights[i + 2])
                      + helper(heights, i + 2, dp);
        }

        dp[i] = Math.min(oneStep, twoStep);

        return dp[i];
    }

    int minCost(int[] heights) {

        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return helper(heights, 0, dp);
    }
}