class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long[] leftSum = new long[n];
        for(int i = 1; i < n; i++) leftSum[i] = leftSum[i - 1] + nums[i - 1];

        long pro = 1;
        int ans = -1;

        for(int i = n - 1; i >= 0; i--) {
            if(leftSum[i] == pro) ans = i;
            if(i > 0) {
                if(pro > 1e14 / nums[i]) pro = (long)1e18;
                else pro *= nums[i];
            }
        }
        return ans;
    }
}