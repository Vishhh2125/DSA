class Solution {
    public int smallestBalancedIndex(int[] nums) {

        int n = nums.length;
        long[] leftSum = new long[n];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        long rightProduct = 1;
        int answer = -1;

        for (int i = n - 1; i >= 0; i--) {

          
            if (leftSum[i] == rightProduct) {
                answer = i;
            }

            if (i > 0) {

                
                if (rightProduct > Long.MAX_VALUE / nums[i]) {
                    rightProduct = Long.MAX_VALUE; 
                } 
                else {
                    rightProduct = rightProduct * nums[i];
                }
            }
        }

        return answer;
    }
}