class Solution {
    public int maxScore(int[] arr, int k) {
         int n =arr.length;
        int size= n-k;
         
          int total =0;

          for(int num:arr){
            total+=num;
          }


          if(size==0) return total;

          int max=0;

           int sum =0;
           int j=0;
        for(int i=0;i<n;i++){

          sum+=arr[i];


          if(i-j+1==size){

            max=Math.max(max,total-sum);

            sum=sum-arr[j];
            j++;
          }
          
         

        }

        return max;
        
    }
}