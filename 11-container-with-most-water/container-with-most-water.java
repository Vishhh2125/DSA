class Solution {
    public int maxArea(int[] arr) {

        int i=0;
        int j =arr.length-1;

          int ans=0;
        while(i<j){

            int left=arr[i];
            int right=arr[j];

            int height=Math.min(left,right);
            int length= j-i;
            ans=Math.max(ans,length*height);

            if(left<right) i++;
            else j--;



        }    

        return ans;    
    }
}