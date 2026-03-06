class Solution {
    public int minOperations(String s) {

        int count1 =0;
        char start1 ='0';
        char start2 ='1';
        int count2=0;

        for(int i=0;i<s.length() ;i++){

            if(start1!=s.charAt(i) ){
                count1++;
            }
            if(start2!=s.charAt(i)){
                count2++;
            }
         

         start1=(start1=='0') ? '1':'0';
         start2=(start2=='0') ? '1':'0';

            
        }

        return Math.min(count1,count2);
        
    }
}