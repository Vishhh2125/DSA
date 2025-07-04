class Solution {
    public int pivotIndex(int[] nums) {

        int n= nums.length;

        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];

        }

         
         int sum=nums[n-1];

         if(sum-nums[0]==0)  return 0;//case for the first index 
        for(int i=1;i<n;i++){

           int left=nums[i-1];
           int right=sum-nums[i];

           if(left==right)  return i;

           

        }


        return -1;
        
    }
}