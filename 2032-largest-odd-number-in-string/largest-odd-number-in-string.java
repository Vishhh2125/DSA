class Solution {
    public String largestOddNumber(String num) {


        StringBuilder str = new StringBuilder(num);  // ✅ correct spelling


        for(int i=str.length()-1;i>=0;i--){
            char ch= str.charAt(i);

            if((ch-'0')%2== 1){
                break;
            }else{

                str.deleteCharAt(i);
                
            }
        }

        return str.toString();
        
    }
}