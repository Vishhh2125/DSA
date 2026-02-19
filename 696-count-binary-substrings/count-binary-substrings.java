class Solution {
    public int countBinarySubstrings(String s) {


        int prev =0;
        int current=1;
         int count =0;

        for(int i=1;i<s.length();i++){
           
           if(s.charAt(i)==s.charAt(i-1)) current ++;
           else{
            prev=current;
            current =1;
           }

           if(prev>=current ){
            //means teher exist a previous grp with prev size fo same number of 1 or zero upto whihc the current is small or equl tat many subarray will be creted 
            count ++;
           }

        }

        return count ;
        
    }
}