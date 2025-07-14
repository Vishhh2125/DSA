class Solution {
    public int missingNumber(int[] arr) {
        
         int  sum=0;
        for(int i=0;i<arr.length;i++){
              
           sum+=arr[i];

        }
         int n =arr.length;
        int ideal= n * (n+1)/2;


        return ideal-sum;
        
    }
}