// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        
Map<Character, Integer> map = new HashMap<>();
        
        
        int max=0;
        int j=0;
        
        for(int i=0;i<s.length();i++){
            
            char ch= s.charAt(i);
            
            map.put(ch,map.getOrDefault(s.charAt(i),0)+1);
            
            
            while(map.get(ch)>1){
                
                char chi=s.charAt(j);
                
                map.put(chi,map.get(chi)-1);
                
                
                if(map.get(chi)==0){
                    map.remove(chi);
                }
                
                j++;
            }
            
            max=Math.max(max,i-j+1);
            
        }
        
        return max;
        
    }
}