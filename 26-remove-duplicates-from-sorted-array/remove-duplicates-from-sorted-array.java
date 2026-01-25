class Solution {
    public int removeDuplicates(int[] nums) {


        int i=0;
        int j=0;

        for(;j<nums.length;j++){

            if(nums[i]!=nums[j]){
                //swap 
                i++;
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

            }

        }

        return i+1;
        
    }
}