class Solution {
    public class  Pair {
        char c;
        int freq;


        Pair(char c ,int freq){
            this.freq=freq;
            this.c=c;
        }
    }
    public String frequencySort(String s) {


        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)-> b.freq-a.freq);
        HashMap<Character,Integer> map = new HashMap<>();


        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for(Character key :map.keySet()){

            pq.add(new Pair(key,map.get(key)));
        }

         StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {


            Pair top = pq.poll(); //it is a pair 
              for(int i=0;i<top.freq;i++){
            ans.append(top.c);

              }


     
        }

      return ans.toString();
        
    }
}