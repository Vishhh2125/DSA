class Solution {
    public long subArrayRanges(int[] arr) {


        long  ans =0;


        for(int i=0;i<arr.length;i++){

            long min=arr[i];
            long  max=arr[i];
            for(int j=i;j<arr.length;j++){

                if(arr[j]<min){
                    min=arr[j];
                    
                }
                if(arr[j]>max){
                    max=arr[j];


                }

            ans+=max-min;

            }

        }

        return ans ;
        
    }
}