class Solution {
    public int minDays(int[] arr, int m, int k) {

        int n =arr.length;

        if((m*k)>n) return -1; //not enought flowers 

         int lo=arr[0];
         int hi=arr[0];

         for(int num:arr){
            lo=Math.min(lo,num);
         }

          for(int num:arr){
            hi=Math.max(hi,num);
         }

          int ans =-1;
         while(lo<=hi){

            int mid= lo+(hi-lo)/2;
             int count=0;
             int bouque=0;

            for(int i =0;i<n;i++){

                if(arr[i]<=mid) count++;
                else count=0; //reset we need consecative

                if(count==k){
                    bouque++;
                    count=0;

                }

            }

            if(bouque>=m){
                // valid condiotn tbut there can be answer which isminimum 
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }


         }


         return ans ;
        
    }
}