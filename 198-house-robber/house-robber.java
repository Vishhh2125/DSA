class Solution {

    public int helper(int[] nums, int i, int sum, int[][] dp) {

        if (i >= nums.length)
            return sum;

        if (dp[i][sum] != -1)
            return dp[i][sum];

        int skip = helper(nums, i+1, sum, dp);
        int take = helper(nums, i+2, sum + nums[i], dp);

        dp[i][sum] = Math.max(skip, take);
        return dp[i][sum];
    }

    public int rob(int[] nums) {

        int total = 0;
        for(int n : nums) total += n;

        int[][] dp = new int[nums.length][total + 1];

        for(int i=0;i<nums.length;i++)
            Arrays.fill(dp[i], -1);

        return helper(nums, 0, 0, dp);
    }
}