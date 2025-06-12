class Solution {
    public int singleNumber(int[] arr) {
       int n =arr.length;
       int first =0;
       int second=0;
        for(int i =0;i<n;i++){

            first = (first^arr[i]) & ~ second;

            second=(second^ arr[i]) & ~first;

        }


        return first;
        
    }
}