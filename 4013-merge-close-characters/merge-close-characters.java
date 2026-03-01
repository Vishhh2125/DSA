class Solution {
    public String mergeCharacters(String s, int m) {

        Deque<Character> st = new ArrayDeque<>();

        HashMap<Character,Integer> map  = new HashMap<>();

           int  k =0;
        for(int i=0;i<s.length();i++){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),k);
                st.push(s.charAt(i));
                k++;
            }else{
                //conatain in map 

                if(k-map.get(s.charAt(i))>m){
                    //vaid one do not rmove 

                    st.push(s.charAt(i));
                    map.put(s.charAt(i),k); //add most latest position 
                    k++;
                    
                }
               
               } //if it si samller than k=map.get(nums[i])<=mi gnore dont add it;            }

        }



        StringBuilder str = new StringBuilder();

        for(Character ch: st){

            str.append(ch);

        }


        return str.reverse().toString();

        }
    
}