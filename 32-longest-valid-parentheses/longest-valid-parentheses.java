class Solution {
    public int longestValidParentheses(String s) {

       if(s.length()<2)  return 0;
        Deque<Integer>  st = new ArrayDeque<>();


        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);


            if(ch =='('){
                st.push(i);
            }else{

                if(!st.isEmpty()  && s.charAt(st.peek())=='('){
                    st.pop();
                }else{

                    //invalid hai to add karke rakho 
                    st.push(i);

                }
            }
        }

          st.addLast(-1);
          st.addFirst(s.length());
        Integer [] arr = st.toArray(new Integer[0]);

        //add -1 at the end to called it as first index 
        //same as we do in prefix sum que  intilse 0-->1
        
        int max=0;




        for(int i=0;i<arr.length-1;i++){

            max=Math.max(max,(arr[i]-arr[i+1])-1);
        }
        

        


         
        




        return max;

        

        
    }
}