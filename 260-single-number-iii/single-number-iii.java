class Solution {
    public int[] singleNumber(int[] arr) {
        int n =arr.length;
        Arrays.sort(arr);
        int[] ans=new int [2];
       int  counter=0;

        for(int i=0;i<n;i=i+2){

            if(i==n-1){
          ans[counter]=arr[i];

            }
            else if(arr[i]!=arr[i+1] ){
                ans[counter]=arr[i];
                counter++;
                i--;

            }
        }
        return ans;
        
    }
}