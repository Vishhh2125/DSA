class Solution {

    public static boolean valid (String ans,List<String> wordDict){

        for(String str: wordDict){
            if(ans.equals(str)){
                return true;
            }

        }
            return false;
    }

    public static void solution(String s ,int start,StringBuilder output,ArrayList<String> ans,List<String> wordDict){

        if(start==s.length()){

            ans.add(output.toString());

            return;
        }


       for(int i=start;i<s.length();i++){

        if(valid(s.substring(start,i+1),wordDict) ){

            int len = output.length(); // remember length before append

            if(output.length()==0){
                output.append(s.substring(start,i+1)); //add to the output

            }else{
                                output.append(" "+s.substring(start,i+1));//add to the output


            }


            solution(s,i+1,output,ans,wordDict);

           
            output.setLength(len);


            

            
             

            

        }

       }





    }
    public List<String> wordBreak(String s, List<String> wordDict) {

        ArrayList<String>  ans = new ArrayList<>();

        solution(s,0,new StringBuilder(""),ans,wordDict);

        return ans;
        
    }
}