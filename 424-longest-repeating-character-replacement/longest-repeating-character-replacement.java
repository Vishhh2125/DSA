class Solution {
    public int characterReplacement(String s, int n) {

        int [] arr=new int[26];

        int max=0;
        int i=0;


        for(int j=0;j<s.length();j++){
            char ch= s.charAt(j);
            arr[ch-'A']++;

            int maxfreq=0;

            for(int k=0;k<arr.length;k++){

                maxfreq=Math.max(maxfreq,arr[k]);

            }


            while((j-i+1)-maxfreq>n){

                char ch1=s.charAt(i);

                arr[ch1-'A']--;
                i++;
            }


            max= Math.max(j-i+1,max);
        }

        return max;
        
    }
}