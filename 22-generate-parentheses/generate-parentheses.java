class Solution {

    public static void solution(int n ,int open,int close,String output,List<String> ans){

       if(open==n && open==close){

        ans.add(output);
        return ;
       }

        if(open<n){
            solution(n,open+1,close,output+"(",ans);
            //for the opening bracket 
        }
        if(close<open){
             solution(n,open,close+1,output+")",ans);
             //for the closing bracket 


        }
    }
    public List<String> generateParenthesis(int n) {

        List<String> ans =  new ArrayList<>();

        solution(n,1,0,"(",ans);

        return ans;
        
    }
}