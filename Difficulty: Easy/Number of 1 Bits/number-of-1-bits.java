// User function Template for Java
class Solution {
    static int setBits(int n) {
 
     int ans =0;
     
     while(n!=0){
         if(n%2==1)  ans++;
         
         n= n >> 1;
     }
     
     return ans ;
    }
}