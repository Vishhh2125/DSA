class Solution {
    public int maxDepth(String s) {


        int count=0;

        int dept=0;


        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }

            dept=Math.max(dept,count);
        }


        return dept;
        
        
    }
}