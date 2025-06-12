class Solution {
    public int minBitFlips(int start, int goal) {

        int result =start ^ goal;
          int counter=0;
          while(result!=0){
             result=result & (result-1);
             counter++;
          }


          return counter;
        

        
    }
}