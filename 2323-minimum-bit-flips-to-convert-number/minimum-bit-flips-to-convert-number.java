class Solution {
    public int minBitFlips(int start, int goal) {

        int diff= start ^ goal;

        //count no of set bits in diff
         int count=0;
        while(diff!=0){

            diff=diff & (diff-1);
            count++;

        }
        return count ;
    }
}