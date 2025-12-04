class Solution {

    public boolean isValid(int [] arr){

        for(int i=0;i<256;i++){

            if(arr[i]>0) return false;
        }

        return true;

    }
    public String minWindow(String s, String t) {
         int start=0;
         int end =0;
         int min =Integer.MAX_VALUE;

        int []arr = new int [256];

        for(int i =0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }


        int i=0;
        int j=0;

        for(;j<s.length();j++){

            int index= s.charAt(j);

            arr[index]--;


            while(isValid(arr)){
                //shrink 
                if(min>j-i+1){
                    //one valide ans 
                    start=i;
                    end=j;
                    min=j-i+1;
                }

                arr[s.charAt(i)]++;
                i++;


            }


        }

        if(min==Integer.MAX_VALUE) return "";
         

         return s.substring(start,end+1);


    
        
    }
}