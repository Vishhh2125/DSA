class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())  return false;


        char [] arr =new char[26];


        for(int i=0;i<s.length();i++){

            int number1= s.charAt(i)-'a';

            arr[number1]++;

            int number2=t.charAt(i)-'a';

            arr[number2]--;
        }



        for(char x:arr){

            if(x!=0)  return false;
        }
     

     return true;

    
    }
}