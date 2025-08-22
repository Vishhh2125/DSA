// User function Template for Java

class Solution {
    
     public static void solution(String input ,String output,ArrayList<String>  ans){
         
         if(input.length()==0){
             
             ans.add(output);
             return ;
         }
         
         char inputchar=input.charAt(0);
         
         input =input.substring(1);
         
         solution(input,output+" "+inputchar,ans);//with space 
         solution(input,output+inputchar,ans);//withpur space
         
         
     }

    ArrayList<String> permutation(String s) {
        // Code Here
        
        ArrayList<String>  ans= new ArrayList<>();
        String input = s.substring(1);
        String output=s.substring(0,1);
        solution(input,output,ans);
        
        return ans;
    }
}