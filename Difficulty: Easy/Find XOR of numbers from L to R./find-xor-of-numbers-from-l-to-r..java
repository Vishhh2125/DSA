// User function Template for Java

class Solution {
    public static int function(int x){
        if(x%4==0)  return x;
        else if(x%4==1)  return 1;
        else if(x%4==2)  return x+1;
        else  return 0;

       }
    public static int findXOR(int l, int r) {
        return function(l-1) ^ function(r);
    }
}