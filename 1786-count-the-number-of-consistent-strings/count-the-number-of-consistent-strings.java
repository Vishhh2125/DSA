class Solution {
    public int countConsistentStrings(String allowed, String[] words) {


        int [] arr = new int [26];


        for(char ch  :allowed.toCharArray()){

            arr[ch-'a']=1;
        }

          int ans=0;

        for(int i=0;i<words.length;i++){
              String str=words[i];
               boolean valid=true;
            for(int j=0;j<str.length();j++){


               if(arr[str.charAt(j)-'a']!=1){
                  valid=false;
                  break;
               }

               
            }

            if(valid)  ans++;

            
        }


        return ans ;


        
    }
}