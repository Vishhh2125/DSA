class Solution {
    public boolean checkOnesSegment(String s) {


        // there is ony one segment of 1 we can use slifing wndow ot count segement 
       
       int count =0;
        
        
       for(int i=0;i<s.length();i++){

        if(s.charAt(i)=='1'){
            count++;

            while(i<s.length() && s.charAt(i)=='1') i++;

        }

        

       }

       if(count ==1) return true ;
       else return false;
    }
}