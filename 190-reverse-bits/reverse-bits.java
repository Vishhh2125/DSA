class Solution {
    public int reverseBits(int n) {


        int ans=0;


        for(int i=0;i<32;i++){

                ans=ans<<1;
             if(n%2==1){
                //even means 0 at last 
                ans++;

             }

            n= n>>1;
        }

        return ans ;
        
    }
}