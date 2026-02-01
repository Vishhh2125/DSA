class Solution {
    public int minimumCost(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < min){
                secondMin = min;
                min = nums[i];
            }
            else if (nums[i] < secondMin){
                secondMin = nums[i];
            }
        }
        return nums[0] + min + secondMin;
    }
}