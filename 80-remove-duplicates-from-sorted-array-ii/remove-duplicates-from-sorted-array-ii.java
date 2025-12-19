class Solution {
    public int removeDuplicates(int[] nums) {


        int i=2;
        int j=2;

        for(;j<nums.length;j++){
            int count=0;
           for(int k=2;k>0;k--){

            if(nums[j]==nums[i-k]) count++;



           }


           if(count<2){
            //valid number 

            int temp =nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;


           }

        }


        return i;
        
    }
}