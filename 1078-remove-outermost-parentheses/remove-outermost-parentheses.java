class Solution {
    public String removeOuterParentheses(String s) {


        StringBuilder ans = new StringBuilder("");

       int count =0;

        for(int i =0;i<s.length();i++){

            char ch = s.charAt(i);


            if(ch=='('){

                if(count>0){

                  ans.append(ch);

                }
                count++;
            }
            else{
                if(count>1){

                    ans.append(ch);


                }
                    count--;
            }

        }


    return ans.toString();
        
    }
}