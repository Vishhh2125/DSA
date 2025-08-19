class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n=arr.length;
        int lower=n+1;//give biggest than array  so that it can swap at companriosn of min
        int upper=n;//give any value as we are finding upper bound 

        int hi=n-1;
        int lo=0;

        while(lo<=hi){
            int mid=lo+((hi-lo)/2);

            if(arr[mid]==target){
                //lower bound but only at if value found or else -1 that is why fiest is 
                //     given mid when equal 
                lower=Math.min(lower,mid);
                hi=mid-1;
                 }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else {
                hi=mid-1;

                
            }
        }
        hi=n-1;
        lo=0;

        while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (arr[mid] > target) {
                    upper = mid; // Possible upper bound found
                    hi = mid - 1; // Move left
                } else {
                    lo = mid + 1; // Move right
                }
            }
        if(lower==n+1){
            int [] ans = {-1,-1};
           return ans;
        }
        else{
        
            int [] ans ={lower,upper-1};
            return ans;
        }
    }
}