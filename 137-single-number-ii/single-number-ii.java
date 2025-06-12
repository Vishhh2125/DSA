class Solution {
    public int singleNumber(int[] arr) {

        Arrays.sort(arr);
        int n =arr.length;

        for(int i=1;i<n;i=i+3){

            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }else if(arr[i]!=arr[i+1]){
                return arr[i+1];
            }


        }

        return arr[n-1];


        
    }
}