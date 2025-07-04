class Solution {
    public int largestAltitude(int[] arr) {

        int max= 0; //first time altitube is zero

         max= Math.max(arr[0],max); //as we are not able to check the first condition due to using arr[i-1]
        for(int i=1;i<arr.length;i++){
             arr[i]+=arr[i-1];
             
             max=Math.max(max,arr[i]);
              

        }

        return max;
        
    }
}