class Solution {

    public boolean  solution(String s ,int i ,int j ,int  count ){

        if(i>j)  return true ;

        if(s.charAt(i)==s.charAt(j)){
            return solution(s,i+1,j-1,count);
        }else{
            if(count==0){
                //have one chnage to ignore a char 
                return solution(s,i+1,j,count+1) || solution(s,i,j-1,count+1);
            }else  return false;
        }
    }
    public boolean validPalindrome(String s) {



           return solution(s,0,s.length()-1,0);
        
        
    }
}