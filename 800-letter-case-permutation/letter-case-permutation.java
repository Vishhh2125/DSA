import java.util.*;

class Solution {

    public static void solution (String input ,String output,ArrayList<String> ans){

        if(input.length()==0){
            ans.add(output);
            return ;
        }

        char inputchar= input.charAt(0);//extract first char from the input 

         input=input.substring(1);//remove frust char from the input

        if(Character.isDigit(inputchar)){
         solution(input,output+inputchar,ans);

        }else{

            if(Character.isUpperCase(inputchar)){
                     solution(input,output+inputchar,ans);
                solution(input,output+Character.toLowerCase(inputchar),ans);

            }else{
                  solution(input,output+inputchar,ans);
                solution(input,output+Character.toUpperCase(inputchar),ans);
                
            }
                

            
        }

    }
    public List<String> letterCasePermutation(String s) {

      ArrayList<String> ans= new ArrayList<>();

      solution(s,"",ans);
      return ans;

      


        
    }
}