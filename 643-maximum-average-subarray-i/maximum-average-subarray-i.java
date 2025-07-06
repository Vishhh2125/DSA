class Solution {
    public double findMaxAverage(int[] arr, int k) {
            int i=0;
            int window=1;
            int  sum=0;
            double max=-100000.0;

           for(int j=0;j<arr.length;j++){
                  sum+=arr[j];
                if(window==k){
                  double avg=(double)sum/k;

                  max=Math.max(max,avg);

                  sum-=arr[i]; //remove ith number
                  i++;

                }else{
                    window++;
                }
                

                
                 
           }

           return max;
        
    }
}