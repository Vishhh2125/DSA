class Solution {
    public String longestCommonPrefix(String[] arr) {

       if(arr.length==0)  return new String("");
        
            String ans ="";
         
        for(int i=0;i<arr[0].length();i++){
           char ch =arr[0].charAt(i); 
        
           for(int j=0;j<arr.length;j++){

            if(i==arr[j].length() || arr[j].charAt(i)!= ch ){
                //upto here teh ans is valid 

                ans= arr[0].substring(0,i);
                return ans ;
            }

           }

            

            

        }
        return arr[0];
    }
}