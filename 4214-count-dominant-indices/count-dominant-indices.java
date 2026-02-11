class Solution {
    public int dominantIndices(int[] nums) {
         int n =nums.length;

       int [] prefix= new int [n];
       int sum=0;
       for(int  i=0;i<n;i++){
           sum+=nums[i];
          prefix[i]=sum;  
           
       }
        

      int count =0;


        for(int i=0;i<n-1;i++){


           double avg= (prefix[n-1]-prefix[i])/(n-i-1);

           if((double)nums[i]>avg) count++;

        }

        return count;


    }
}