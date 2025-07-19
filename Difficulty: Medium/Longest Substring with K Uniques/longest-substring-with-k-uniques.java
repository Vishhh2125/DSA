class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        
        int max=0;
        
        
        Map <Character,Integer> map = new HashMap<>();
        
        int i=0;
        
        
        for(int j =0;j<s.length();j++){
            
            char ch = s.charAt(j);
            
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            
        if(map.size()==k){
            
            max=Math.max(max,j-i+1);
        }
        
        
        while(map.size()>k){
            
            char chi=s.charAt(i);
            
            map.put(chi,map.get(chi)-1);
            
            if(map.get(chi)==0){
                
                map.remove(chi);
            }
            i++;
        }
        
            
        }
        
        if(max==0){
            return -1;
            
            //means min number of character is smaller tahn k ;
        }
        
        return max;
        
    }
}