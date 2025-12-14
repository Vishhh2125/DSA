class Solution {
    public long countSubarrays(int[] nums, int k) {
         
         int max=0;
         long ans =0;
         for(int num :nums){
            max=Math.max(num,max);
         }
          int count=0;
         int i=0;
        for(int j=0;j<nums.length;j++){

           if(nums[j]==max) count++;

           while(count==k){
             
             ans=  ans+ (long)nums.length-j;

             if(nums[i]==max)  count--;
             i++;

           }

        }     

        return ans;   
    }
}