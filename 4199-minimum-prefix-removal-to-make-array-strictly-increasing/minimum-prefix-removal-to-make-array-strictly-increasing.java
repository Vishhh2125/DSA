class Solution {
    public int minimumPrefixLength(int[] nums){

        int i=0;
        int j=0;

        for(;j<nums.length;j++){
            if(j>0 && nums[j]<=nums[j-1]){
                i=j;

            }
        }

        return i;


        
    }
}