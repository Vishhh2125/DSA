class Solution {
    public int minFlips(int a, int b, int c) {

         int flip=0;
        while(a!=0 || b!=0 || c!=0){
            int abit= a&1;
            int bbit=b & 1;
            int cbit= c&1 ;


            if(cbit==1){

                if(abit==0 && bbit==0){
                    // both are zero  means anwer will be zero but we need answer to be 1 
                    // so just any 1 bit flip means or will be 1 
                    flip++;
                }
            }else{
                //cbit==0
                //to make cbit zero both should be zero a nad b 

                if(abit==1) flip++;
                if(bbit==1)flip++;
            }


            //right shft by ine to answer for next bit 
            a=a>>1;
            b= b>>1;
           c= c>>1;
        }

        return flip;
        
    }
}