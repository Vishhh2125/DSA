class Solution {
    //count set bits 
    public int[] countBits(int n) {
      
      int [] ans = new int [n+1];

        for(int i=0;i<=n;i++){

            //count teh bots by unsetting the rightmost set bit 
            int count =0;
            int temp=i;

            while(temp!=0){

                temp= temp & (temp-1);
                count++;
            }

            ans[i]=count;

        }


        return ans ;
        
    }
}