class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
          int n =derived.length;
        int [] original = new int [derived.length];

        original[0]=0;

        for(int i=0;i<n-1;i++){
            if(derived[i]==1){
                if(original[i]==0) original[i+1]=1;
                else original[i+1]=0;

            }else{
                //dervied is 0 so both should be similar

                if(original[i]==0) original[i+1]=0;
                else original[i+1]=1;
            }

        }


        if((original[n-1] ^ original[0])==derived[n-1]) return true;
        else return false;
    }
}