class Solution {
    public boolean rotateString(String s, String goal) {


        if(s.length()!=goal.length())  return false;
           
           StringBuilder str= new StringBuilder(s);

           str.append(s);

           return str.toString().contains(goal);
        
    }
}