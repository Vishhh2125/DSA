class Solution {
    public boolean checkOnesSegment(String s) {
       
       boolean flag =false;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1' && flag==false){
            flag=true;

            while(i<s.length() && s.charAt(i)=='1') i++;

        }else{

         if(flag==true && s.charAt(i)=='1') return false;
        }
         


          
       }

       return true ;
    }
}