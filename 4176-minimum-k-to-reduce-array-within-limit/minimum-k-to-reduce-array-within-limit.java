class Solution {
    public int minimumK(int[] nums) {

       long  lo=1;
        long hi=nums[0];

        for(int i=0;i<nums.length;i++){
            hi+=(long)nums[i];
            
        }
         long  ans=hi;
        while(lo<=hi){

            long mid = lo+ (hi-lo)/2;

             long times=0;
            for(int i=0;i<nums.length;i++){
                times += (nums[i] + mid - 1) / mid; // correct ceiling division
              
              
            }

            if(times>mid*mid){
                //not valid need need big number 
                lo=mid+1;
                
            }else{
                //this valid go fro minmum 
             ans=Math.min(ans,mid);
                hi=mid-1;
            }

            
            
        }

        return  (int)ans;
    }
}