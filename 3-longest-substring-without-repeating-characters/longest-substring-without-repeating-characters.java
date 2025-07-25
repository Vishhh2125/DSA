class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map <Character,Integer> map  = new HashMap<>();
        int max=0;
        int  i =0;
        for(int j=0;j<s.length();j++){


         map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);


         while(map.get(s.charAt(j))>1){
           
           map.put(s.charAt(i),map.get(s.charAt(i))-1);

           if(map.get(s.charAt(i))==0){
            map.remove(s.charAt(i));
           }

           i++;



         }


         max=Math.max(max,j-i+1);

        }
        
        return max;
    }
}