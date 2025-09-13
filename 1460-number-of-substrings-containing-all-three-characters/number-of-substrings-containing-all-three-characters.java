class Solution {
    public int numberOfSubstrings(String s) {


        HashMap<Character,Integer> map= new HashMap<>();

        int left =0;
        int result=0;

        for(int right =0;right<s.length();right++){

            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);


          

                while(map.size()==3){

                    result+=s.length()-right;//getting all combination with this substrring which is valid from right to end 
                    
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);//remove from left as freq

                     if(map.get(s.charAt(left))==0){
                             //its frequenchy is zero rremove the key from  hashamap

                          map.remove(s.charAt(left));

                        }

                      left++;
                    
                 }
            
        }


        return result;


    
        
    }
}