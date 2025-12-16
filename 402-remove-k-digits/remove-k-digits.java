class Solution {
    public String removeKdigits(String num, int k) {


        StringBuilder st = new StringBuilder();

         int count=0;

        for(int i=0;i<num.length();i++){

            while(st.length()!=0 && num.charAt(i)<st.charAt(st.length()-1)  && count<k ){

                st.deleteCharAt(st.length()-1);
                count++;

            }

            st.append(num.charAt(i));

        }

        while(count<k){

            st.deleteCharAt(st.length()-1);
            count++;
        }


        int i=0;
         
        while(i<st.length()  && st.charAt(i)=='0') i++;


        if(i==st.length()) return "0";

        String ans = st.toString().substring(i);


        return ans ;
        
    }
}