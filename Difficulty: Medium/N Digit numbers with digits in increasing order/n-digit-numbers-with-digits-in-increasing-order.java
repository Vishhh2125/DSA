
class Solution {
    public static void solution(int n ,ArrayList<Integer> ans,String output){
        
      if(output.length()==n){
         int num = Integer.parseInt(output); //check weather after parsing the num is of n size 
         

         if((num+"").length()==n){
             //now to check weather the num is correct size or not 
            //  bcz 001--->1 converted to 1 digit if the zeros at fist for parseInt
             
          ans.add(num);
         }
          return;
      }
      
      
      for(int i=0;i<10;i++){
          
          
          char temp = (char) (i+'0');
          
          if(output.equals("") || temp >output.charAt(output.length()-1) ){
              //means strictly greater than output
              
              solution(n,ans,output+temp);
          }
          
      }
      
      
     
    }
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        
        ArrayList<Integer>  ans= new ArrayList<>();
        
        solution(n,ans,"");
        
        return ans;
        
    }
}
