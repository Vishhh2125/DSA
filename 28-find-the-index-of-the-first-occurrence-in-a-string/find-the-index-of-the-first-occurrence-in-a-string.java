class Solution {
    public int strStr(String haystack, String needle) {


         int n =needle.length();
        int i=0;
        int j=0;

        for(;j<haystack.length();j++){


            if(j-i+1==n){
                if(haystack.substring(i,j+1).equals(needle))  return i;

                i++;

            }

            
        }


        return -1;
        
    }
}