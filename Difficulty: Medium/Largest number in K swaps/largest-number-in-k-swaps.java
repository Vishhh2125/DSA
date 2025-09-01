

class Solution {
    // Function to find the largest number after k swaps.
    public static String solution(StringBuilder str ,int index,int swap){
        
        if(swap==0 || index==str.length()){
            
            //created a combination avlidate for ans 
            
           return str.toString();
        }
        
        
        String maxans= str.toString();
        char max_digit=str.charAt(index);
        
        for(int i=index+1;i<str.length();i++){
            
            if(str.charAt(i)>max_digit){
                max_digit=str.charAt(i);
            }
            
        }
        
        if(max_digit>str.charAt(index)){
            // means we found a digit max(largest than current index char)
            
            
            for(int i=index+1;i<str.length();i++){
                
                 
            if(str.charAt(i)==max_digit){
                //then only look for swap 
                //swapped the number 
                char temp = str.charAt(index);
                str.setCharAt(index,str.charAt(i));
                str.setCharAt(i,temp);
                
                //calling function 
                String ans = solution(str,index+1,swap-1);
                
                //backtarcking the swap 
                 str.setCharAt(i, str.charAt(index));
                str.setCharAt(index, temp);
                
                //compare teh ans for returning 
                
                if(Long.parseLong(ans)>Long.parseLong(maxans)){
                    maxans=ans;
                }
                
                
            }
                
                
                
            }
        }
        
        
        String ans=        solution(str, index + 1, swap);
         
         
          if(Long.parseLong(ans)>Long.parseLong(maxans)){
                    maxans=ans;
                }
         
         
            
            
          
           
            
        
        
        
        
        
        return maxans;
        
        
    }
    public String findMaximumNum(String s, int k) {
        // code here.
        
        
        return solution(new StringBuilder(s),0,k);
    }
}