class Solution {
    public int reverseBits(int n) {


        //check each last bit of n and copy it to teh ans 
        //right shift the n 
        //left shift the ans 
        //pop digit from last of n and push to te last of ans 


        int ans=0;


        for(int i=0;i<32;i++){

                ans=ans<<1;
             if(n%2==1){
                //odd mean give 1 to teh last by first shifting left 
                ans++;

             }

            n= n>>1;
        }

        return ans ;
        
    }
}