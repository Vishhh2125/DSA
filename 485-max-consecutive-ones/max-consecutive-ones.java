class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {


        int max=0;

        int i =-1;
        int j =0;

        for(;j<nums.length;j++){

            if(nums[j]==0){

               i=j;
            }else{
                max=Math.max(max,j-i);
            }

        }


        return max;
        
    }
}