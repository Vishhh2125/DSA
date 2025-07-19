class Solution {
    public String largestOddNumber(String num) {


        StringBuilder str = new StringBuilder(num);  

          int i;
        for( i=str.length()-1;i>=0;i--){
          
          if((str.charAt(i)-'0')%2==1){
            break;

          }

           
        }

        String string= str.toString();


        if(i<0){
            return "";
        }

        string=string.substring(0,i+1);

        return string;
        
    }
}