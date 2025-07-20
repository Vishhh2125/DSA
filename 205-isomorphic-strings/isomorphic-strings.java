class Solution {
    public boolean isIsomorphic(String s, String t) {


        Map<Character,Character>  map1 = new HashMap<>();
        Map<Character,Character>  map2 = new HashMap<>();
         boolean flag=true;

        for(int i =0;i<s.length();i++){

            if(!map1.containsKey(s.charAt(i))){

                map1.put(s.charAt(i),t.charAt(i));

            }else{
                char ch=map1.get(s.charAt(i));
                if(ch!=t.charAt(i)){
                
                    flag=false;
                    break;

                }
            }


            if(!map2.containsKey(t.charAt(i))){

                map2.put(t.charAt(i),s.charAt(i));
                
            }else{
                char ch = map2.get(t.charAt(i));
                if(ch!=s.charAt(i)){
                    flag=false;
                    break;
                }
            }

        }

     return flag;
        
    }
}