class Solution {
    public int[] searchRange(int[] arr, int target) {

        if(arr.length==0)  return new int [] {-1,-1};

        int [] ans = new int [2];

        int lo =0;
        int hi=arr.length-1;
        int first=Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;

        //lest find teh firsst occurance that si near lower bound
        while(lo<=hi){
            
            int mid = lo+ (hi-lo)/2;

            if(arr[mid]==target){
                first =Math.min(first,mid);
                hi=mid-1;

            }else if (arr[mid]>target){
                hi=mid-1;

            }else{
                lo=mid+1;

            }

        }

        //checck if the lo is really a target or target is missing and we are getting nearest eleemnt 
        
       



        //for last occurance 

        lo=0;
        hi=arr.length-1;

         while(lo<=hi){
            
            int mid = lo+ (hi-lo)/2;

            if(arr[mid]==target){
                last=Math.max(last,mid);
                lo=mid+1;

            }else if (arr[mid]>target){
                hi=mid-1;

            }else{
                lo=mid+1;

            }

        }

      if(first==Integer.MAX_VALUE)  first =-1;

      if(last==Integer.MIN_VALUE) last=-1;



        return new int [] {first,last};
        
    }
}