class Solution {
    public boolean isValid(String s) {


        Deque<Character>  st= new ArrayDeque<>();


        for(int i=0;i<s.length();i++){

            if(st.isEmpty()){
                //directly add no comparison

                st.push(s.charAt(i));
            }else if(s.charAt(i)=='(' ||
                 s.charAt(i)=='{' ||
                 s.charAt(i)=='['  ){
                    //add into teh stack 

                    st.push(s.charAt(i));
             }else{

                //means we have to comoare here 

                  char ch = st.pop();
                if((s.charAt(i)==')'  && ch!='(')  || (s.charAt(i)==']'  && ch!='[')  || (s.charAt(i)=='}'  && ch!='{' ) )  return false ;
             }
            
            

                
        }


        if(!st.isEmpty()) return false;

        return true;
        
    }
}