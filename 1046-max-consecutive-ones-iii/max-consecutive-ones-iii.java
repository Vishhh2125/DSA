class Solution {
    public int longestOnes(int[] arr, int k) {
        int n =arr.length;
          int i =0;
          int zero=0;
          int max=0;
        for(int j=0;j<n;j++){
            
            if(arr[j]==0) zero++;

            if(zero>k){
                  max=Math.max(max,j-i);

                  while(zero>k){
                    if(arr[i]==0) zero--;

                    i++;

                    }
            }


           if(j==n-1){
                              max=Math.max(max,j-i+1);

           }

        }

        

        return max;
        
    }
}