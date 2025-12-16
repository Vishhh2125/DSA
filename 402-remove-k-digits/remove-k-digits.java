class Solution {
    public String removeKdigits(String num, int k) {

       Deque<Character> st = new ArrayDeque<>();

        StringBuilder ans =  new StringBuilder();

          int count=0;

        for(int i=0;i<num.length();i++){

           


           while(!st.isEmpty()  && num.charAt(i)<st.peek() && count<k){

            st.pop();
            count++;

           }

           st.push(num.charAt(i));


        }



      ///if ke removal not staisfied just remove form back as the currnet ahve all ellemennt in acesding 
        while(!st.isEmpty() && count<k){

            st.pop();
            count++;

        }


        //check from first if there is any leading zero that shouldn't be there 

        while(!st.isEmpty()  && st.peekLast()=='0'){


            st.removeLast();
        }

        for(Character ch :st){

            ans.append(ch);
        }


        if(ans.length()==0) return "0";


        return ans.reverse().toString();
        
    }
}