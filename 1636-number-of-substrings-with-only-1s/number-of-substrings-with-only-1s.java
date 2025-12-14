class Solution {
    public int numSub(String s) {

        long ans =0;


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
            char current = s.charAt(i);
            long  count =1;

            while(i<s.length()-1 && current == s.charAt(i+1)){
                i++;
                count++;
            }


             long contribution = (count* (count+1))/2;

             ans= (ans+contribution) %1000000007;


            }


        }

        return  (int)ans ;
        
    }
}