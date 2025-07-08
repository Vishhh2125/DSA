class Solution {
    public int longestSubarray(int[] arr) {

        int n =arr.length;
        int zero=0;

        int i=0;
        int max=0;

        for(int j=0;j<n;j++){

            if(arr[j]==0) zero++;

            while(zero>1){

                if(arr[i]==0)  zero--;

                i++;

            }

            max=Math.max(max,j-i);


        }


        return max;
        
    }
}