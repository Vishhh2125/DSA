class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n =nums.length;
        int [] left = new int [n];
        int []right = new int [n];
        int [] ans = new int [n];


          int left_sum=0;
          int right_sum=0;
        for(int i=0;i<n;i++){
             
             left[i]=left_sum;
             right[i]=right_sum;

             left_sum+=nums[i];
             right_sum+=nums[n-1-i];


        }


        for(int i =0;i<n;i++){

            ans[i]=Math.abs(left[i]-right[n-1-i]);
        }


        return ans ;
        
    }
}