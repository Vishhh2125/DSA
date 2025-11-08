class Solution {
    public String reverseWords(String s) {

      s=s.trim();
      //reverse each word 


      String [] arr =s.split("\\s+");

        StringBuilder ans = new StringBuilder();
       for(int i=0;i<arr.length;i++){
        StringBuilder str= new StringBuilder(arr[i]);

        str.reverse();

        if(ans.length()!=0){
            ans.append(" ");
        }

        ans.append(str);


       } 


       // now reverse whiole string 




       return ans.reverse().toString() ;

        
    }
}