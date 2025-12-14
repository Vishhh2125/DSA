class Solution {
    public int maxAscendingSum(int[] nums) {


        int i=0;
        int sum=0;
        int max=0;
        for(int j=0;j<nums.length;j++){
           if(j>0 && nums[j]<=nums[j-1]){
               sum=0; //reset teh value to teh current 
           }
           
              sum+=nums[j];
              max=Math.max(sum,max);
        }


        return max;
        
    }
}