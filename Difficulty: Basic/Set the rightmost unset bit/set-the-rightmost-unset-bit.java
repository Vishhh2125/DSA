// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
        
        
      int nth=0;
      
      boolean flag = false;
        int mask =1;

      while(!flag){
          
          if((n & mask)!=0) {
              // the nth bit is  zero 
              nth++;
              mask =mask << 1;
              
          } else{
              //meanth this the bit 1 in n 
              flag = true;
          }
      }
      

      return (n ^ mask );
      
    }
}