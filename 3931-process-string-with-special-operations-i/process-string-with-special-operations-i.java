class Solution {
    public String processStr(String s) {
      

      StringBuilder str= new StringBuilder();

     for(int i=0;i<s.length();i++){

        char ch = s.charAt(i);

        if(str.length()!=0 &&  ch=='#'){

          str.append(str);  //duplicate teh whole string 
         }else if (str.length()!=0 &&  ch=='*'){

            str.deleteCharAt(str.length() - 1);
        }else if (str.length()!=0 && ch=='%'  ){

            str.reverse();
        }else if (Character.isLowerCase(ch)){
            str.append(ch);
        }
     }



     return str.toString();
        
    }
}