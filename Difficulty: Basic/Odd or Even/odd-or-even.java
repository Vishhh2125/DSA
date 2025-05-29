// User function Template for Java
class Solution {
    static boolean isEven(int n) {
        // code here
        
        int mask =1;
        int result = n & 1;
        
        if(result==0) return true  ;
        else return false ;
        
    }
}