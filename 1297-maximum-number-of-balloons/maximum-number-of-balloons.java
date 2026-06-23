class Solution {
    public int maxNumberOfBalloons(String text) {

        int [] arr = new int [26];


        for(int i =0;i<text.length();i++){

            char ch = text.charAt(i);;

            arr[ch-'a']++;
        }




       int ans =Integer.MAX_VALUE;
     


         String str= "balloon";

         for(int i =0;i<str.length();i++){

            int ch =str.charAt(i);
              int count =arr[ch-'a'];

              if(ch=='l'  || ch=='o'){
                count=count/2;
              }
            ans=Math.min(count,ans);
         }


         return ans;
    }
}