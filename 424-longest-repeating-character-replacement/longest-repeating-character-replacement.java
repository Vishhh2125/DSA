class Solution {

    public int  maxfreq(int []arr){
        int max=0;
         int max_index=0;
        for(int i=0;i<26;i++){

            if(arr[i]>max){
                max_index=i;
                max=arr[i];
            }
            
        }

        return max_index;
    }
    public int characterReplacement(String s, int k) {


        int [] arr = new int [26];


        int i=0;
        int j=0;
         int max=0;
        for(;j<s.length();j++){
            // expand
            arr[s.charAt(j)-'A']++;
           
            
            while((j-i+1)-arr[maxfreq(arr)]>k){
                //shrink

                arr[s.charAt(i)-'A']--;
                i++;
            }

            max=Math.max(max,j-i+1);

        }

        return max;
        
    }
}