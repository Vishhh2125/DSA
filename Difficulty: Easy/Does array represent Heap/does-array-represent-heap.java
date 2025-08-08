// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        
        
        int  start=(int)(n/2)-1;
        
        
        for(int i =start;i>=0;i--){
            
            int left=(int)2*i+1;
            int right=(int)2*i+2;
            
            
            if(left<=n-1 && arr[i]<arr[left]) {
                return false;
            }
            
            if(right<=n-1 && arr[i]<arr[right])  return false;
        }
        
        
        return true;
    }
}