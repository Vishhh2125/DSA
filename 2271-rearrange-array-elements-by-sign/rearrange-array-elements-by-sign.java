class Solution {
    public int[] rearrangeArray(int[] nums) {

        int []ans = new int[nums.length];
        int i =0;
        int j =1;
        for(int c =0;c<nums.length;c++){

            if(nums[c]>0){
                ans[i]=nums[c];
                i+=2;
            }else{
                ans[j]=nums[c];
                j+=2;
            }

        }

        return ans ;
        
    }
}