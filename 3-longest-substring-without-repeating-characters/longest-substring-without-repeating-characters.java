class Solution {
    public int lengthOfLongestSubstring(String s) {
            if(s.length()==0) return 0 ; 

        HashMap<Integer,Integer> map = new HashMap<>();

        int i=0;
        int j=0;
         int max=0;
        for(;j<s.length();j++){
            

            map.put(s.charAt(j)-'a',map.getOrDefault(s.charAt(j)-'a',0)+1);

            while(map.get(s.charAt(j)-'a')>1){
               //shrink the window 
                map.put(s.charAt(i)-'a',map.get(s.charAt(i)-'a')-1);

                if(map.get(s.charAt(i)-'a')==0){
                    map.remove(s.charAt(i)-'a');
                }
               i++;
            }
           max= Math.max(max,j-i+1);
        }
        return max;
    }
}