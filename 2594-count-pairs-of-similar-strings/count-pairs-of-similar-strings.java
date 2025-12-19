class Solution {

    public int similarPairs(String[] words) {

        int n = words.length;
        int[][] freq = new int[n][26];

          for(int i=0;i<words.length;i++){
            for(char ch :words[i].toCharArray()){

                freq[i][ch-'a']=1;
            }
          }

          //for each i is index and in that form j=0 to j<26 is char freq 
        int ans =0;

          for(int i=0;i<freq.length;i++){
            for(int j=i+1;j<freq.length;j++){
                boolean valid =true;
                for(int k=0;k<26;k++){
                   if( freq[i][k]!=freq[j][k]){
                    valid=false;
                    break;
                   }
                   
                }
                if(valid) ans++;
            }
          }
        return ans;
    }
}
