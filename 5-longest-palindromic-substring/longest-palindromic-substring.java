class Solution {
      
      public int [] isPalindrome(String s ,int i,int j  ){
        

        while(i>=0 && j<s.length()){


            if(s.charAt(i)!=s.charAt(j))  break ;
            i--;
            j++;

        }

        return new int []{i+1,j-1};
      }
    public String longestPalindrome(String s) {
          int start =0;
          int end =0;
          int max=0;

        for(int i=0;i<s.length();i++){

           int [] ans1  = isPalindrome(s,i,i);

           if( ans1[1]-ans1[0]+1>max){

            start=ans1[0];
            end=ans1[1];
            max=ans1[1]-ans1[0]+1;

            

           }  

           if(i+1<s.length()){

                    int [] ans2  = isPalindrome(s,i,i+1);

                    if( ans2[1]-ans2[0]+1>max){

                        start=ans2[0];
                        end=ans2[1];
                         max=ans2[1]-ans2[0]+1;

                    

                    }  
           }



        }
        return s.substring(start,end+1);
    }
}