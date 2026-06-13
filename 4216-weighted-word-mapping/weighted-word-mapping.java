class Solution {
    public String mapWordWeights(String[] words, int[] weights) {


        StringBuilder ans = new StringBuilder();

        for(int i =0;i<words.length;i++){

           String str= words[i];
           int sum =0;

           for(int j =0;j<str.length();j++){
             
             sum+=weights[str.charAt(j)-'a'];


           }

           sum=sum%26;

           char ch = (char) ('z'-sum);
           ans.append(ch);

           
        }


        return ans.toString();
        
    }
}