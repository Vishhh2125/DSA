class Solution {
    public int maxProfit(int[] arr) {

        int max=0;
        int profit=0;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
            }

           profit= Math.max(profit,max-arr[i]);
        }

        return profit;
        
    }
}