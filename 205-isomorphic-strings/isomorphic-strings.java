class Solution {
    public boolean isIsomorphic(String s, String t) {

        boolean ans= true;

        HashMap<Character,Character> map= new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            
            if(map.containsKey(s.charAt(i))){

                char ch = map.get(s.charAt(i));


                if(ch!=t.charAt(i)){
                   ans= false;
                   break;
                }
            }else{
                //mapping not present 
                //add new  mapping 
                if(set.contains(t.charAt(i))){
                    ans=false;
                    break;
                }
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            
            }
        
        }


        return ans;
        
    }
}