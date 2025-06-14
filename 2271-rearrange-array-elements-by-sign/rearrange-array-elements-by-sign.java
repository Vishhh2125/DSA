class Solution {
    public int[] rearrangeArray(int[] arr) {

        int n =arr.length;

        int[] ans= new int [n];

         int i=0;
         int j =1;
        for(int current =0;current<n;current++){

           if(arr[current]>0 && i<n){
            ans[i]=arr[current];
            i=i+2;

           }else if(arr[current]<0 && j<n){
            ans[j]=arr[current];
            j=j+2;
           }

        }
       return ans; 
    }
}