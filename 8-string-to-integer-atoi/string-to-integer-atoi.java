class Solution {
    public int myAtoi(String s) {


       int i=0;
       int n =s.length();


       while(i<n && s.charAt(i)==' ') i++;


       int sign=1;


       if(i<n && s.charAt(i)=='-') {
       sign=-1;
       i++;
       }else if(i<n && s.charAt(i)=='+'){
        //ignore as sign is positive 

        i++;
       }
        


       long  ans=0;
       while(i<n  ){

        if(s.charAt(i)>=48 && s.charAt(i)<=57){
            // this is character just add number 

            ans= ans*10 +( s.charAt(i)-'0');
            i++;
        }else{
            break;
        }


        if(sign*ans>Integer.MAX_VALUE){
         return Integer.MAX_VALUE;
        }
        if(sign * ans<Integer.MIN_VALUE){
          return Integer.MIN_VALUE;

          //here while comapring why have we taken the -ans beacuse own ans is in positive form and sign is telling usweather is number neagtive or psoitive 


        }
    
       }


       return (int) ans * sign;

    }
}