class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        int i=0;
        int sign=1;
         //check for sign if have 
        if( i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(i<s.length() && s.charAt(i)=='+'){
            sign=1;
            i++;

        }
       
       //skip teh leading zeros 

       while( i<s.length() && s.charAt(i)=='0') i++;

        
         long ans =0;


        while(i<s.length() ){
         
         if(!Character.isDigit(s.charAt(i))) break ;


          ans=ans*10 + (s.charAt(i)-'0');
          i++;


          if( sign==1 && ans>Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;

          }

          if(sign ==-1 && -ans<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
          }

       


        }

      


        return (int) ( sign * ans) ;
        
    }
}