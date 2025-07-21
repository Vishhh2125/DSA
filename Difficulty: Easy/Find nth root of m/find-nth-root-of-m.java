

// User function Template for Java

class Solution {
    public int nthRoot(int n, int number) {
        
       int  lo=1;
      int   hi=number;
        
        while(lo<=hi){
             int mid=lo+(hi-lo)/2;
             
             
             if(Math.pow(mid,n) == number){
                 return mid;
             }
             else if(Math.pow(mid,n)>number){
                 hi=mid-1;
                 
             }
             else if(Math.pow(mid,n)<number){
                 lo=mid+1;
             }
        }
        
        return -1;
    }
}