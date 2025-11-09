class Solution {
    public boolean isIsomorphic(String s, String t) {

        boolean ans= true;

        HashMap<Character,Character> map= new HashMap<>(); // to map from s to t
        Set<Character> set = new HashSet<>();  // to set weather the t character is ampped to naoythe ror not before mapping ftom s to t 
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
                    //cheack before mapping the s to t werather t is mapped to any other 
                    // beacuse map tracks s string char not t 
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