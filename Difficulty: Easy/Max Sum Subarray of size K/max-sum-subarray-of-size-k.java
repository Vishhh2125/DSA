class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        
        int i=0;
        int j=0;
        int max=0;
        int sum =0;
        for(;j<arr.length;j++){
            
            sum+=arr[j];
            
            if(j-i+1==k){
                max=Math.max(sum,max);
                sum= sum-arr[i];
                i++;
            }
        }
        return max;
    }
}