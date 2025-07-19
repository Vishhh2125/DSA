class Solution {


    public String reverseWords(String s) {


        String []arr = s.trim().split("\\s+");
         
         StringBuilder ans= new StringBuilder();

        for(int i =0;i<arr.length;i++){

            StringBuilder temp  = new StringBuilder(arr[i]);

            if(i!=0){
                ans.append(" ");

            }

            ans.append(temp.reverse());

            
        }

        ans=ans.reverse(); //reverse qagain 

        return ans.toString() ;
        
    }
}