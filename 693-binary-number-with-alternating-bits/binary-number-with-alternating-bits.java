class Solution {
    public boolean hasAlternatingBits(int n) {
        int num=n;

        int pos=0;
       int count =0;
      for(int i=0;i<32;i++){

        if((num & 1)==1) pos=count;

        count++;
        num =num>>1;
      }
       

       int bit =n&1;
       n=n>>1;

      for(int i=1;i<=pos;i++){

        if((n & 1)==bit)  return false;
          bit=n &1;
        n=n>>1;


        
      }
        
        return true;
    }
}