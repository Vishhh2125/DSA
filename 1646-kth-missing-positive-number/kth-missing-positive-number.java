class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        int lo=0;
        int hi =arr.length-1;

        while(lo<=hi){
            int mid =lo+(hi-lo)/2;

            int ideal_num=mid+1;
            int missing = arr[mid]-ideal_num;

            if(missing>=k){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
            
        }
        //when the loop breaks that time hi and lo will be in such psoition that tehmisisng number is betwween them 
        if(hi<0){
            return k ;
        }
         int missing= arr[hi]-(hi+1);
        int ans= arr[hi]+(k-missing);

        return ans ;
    }
}