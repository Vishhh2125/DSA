class Solution {
    public boolean isValid(char ch ){

        if(Character.toLowerCase(ch)=='a' 
        || Character.toLowerCase(ch) =='e'
        || Character.toLowerCase(ch)=='i'
        || Character.toLowerCase(ch)=='o'
        || Character.toLowerCase(ch)=='u'
        ) return true ;
        else return false;
    }
    public String reverseVowels(String s) {

        int i=0;
        int j =s.length()-1;
        StringBuilder str = new StringBuilder(s);

        while(i<=j){


            while(i<=j && !isValid(s.charAt(i)) ) i++;
            while(i<=j && !isValid(s.charAt(j))) j--;

            if(i<=j){
                char temp = str.charAt(i);
                str.setCharAt(i,str.charAt(j));
                str.setCharAt(j,temp);
                i++;
                j--;
            }
        }

        return str.toString();
        
    }
}