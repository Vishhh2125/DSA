class Solution {
    public String removeDuplicates(String s) {
     



     Deque<Character>  st= new ArrayDeque<>();



     for(int i=0;i<s.length();i++){

        if(st.isEmpty()) st.push(s.charAt(i));
        else{

            if(s.charAt(i)==st.peek()) st.pop();
            else  st.push(s.charAt(i));

        }


     }



        StringBuilder ans = new StringBuilder();

     for(Character ch :st){

        ans.append(ch);

     }


     return ans.reverse().toString();
     }


     
        
    
}