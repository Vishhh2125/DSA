// User function Template for Java

class Solution {
    
    public static void solution(int n ,String output , List<String> ans){
       
      if(output.length()==n) {
          
          if(!output.contains("11")){
          ans.add(output);
             
          }
          
          return ;
          
      }
      
      solution(n,output+"0",ans);
      solution(n,output+"1",ans);
        
        
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        
        List<String>  ans=  new ArrayList<>();
        
        solution(n,"",ans);
        
        return ans;
        
    }
}
