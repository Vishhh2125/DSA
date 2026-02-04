class Solution {
    //all set bit menas the total value f teh number will be 2^k-1 
    public int smallestNumber(int n) {
         
         while(true){
             int num=n;
            while((num & 1) ==1){
                //left shift upto teh last bit is 1 
                //after teh loop over chekc if teh number is zero if yes means all bit were 1 
               num= num>>1;

            }
            if(num==0) return n;
            n++;

            
         }

         
    }
}