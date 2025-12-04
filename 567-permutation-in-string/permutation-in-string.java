class Solution {

    public boolean isValid(int []arr){

        for(int i=0;i<26;i++){
            if(arr[i]!=0)  return false;
        }

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {

       int [] arr = new int [26];


       for(int i=0;i<s1.length();i++){

            arr[s1.charAt(i)-'a']++;

       }


       int i=0;
       int j=0;

       for(;j<s2.length();j++){

           int index= s2.charAt(j)-'a';

           arr[index]--;
           
           

           if(j-i+1==s1.length()){

             if(isValid(arr))  return true;

             arr[s2.charAt(i)-'a']++;
             i++;
            

           }
       }


     return false;   
    }
}