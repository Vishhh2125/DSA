class Solution {

    public class Pair {
        int index;
        int value;

        Pair(int index, int val) {
            this.index = index;
            this.value = val;
        }
    }

    public int maximumSwap(int num) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.value == b.value) return b.index - a.index;
            return b.value - a.value;
        });

        Integer num1 = num;
        String str = num1.toString();

        int j = 0;
        for (char ch : str.toCharArray()) {
            pq.add(new Pair(j, ch - '0'));
            j++;
        }

        StringBuilder str1 = new StringBuilder(str);

        int swap = 1;
        int i = 0;
        while (swap >= 1 && i < str1.length()) {

             while( !pq.isEmpty() && pq.peek().index<i){
                pq.poll();
             }

             if(pq.isEmpty()) break ; //current ans in best position


             if(str1.charAt(i)-'0'!=pq.peek().value  ){
                int k =pq.peek().index;
                char ch = str1.charAt(i);
                str1.setCharAt(i,str1.charAt(k));
                str1.setCharAt(k,ch);
                swap--;
                
             }
             i++;
        }

        int ans = 0;
        for (int k = 0; k < str1.length(); k++) {
            ans = ans * 10 + (str1.charAt(k) - '0');
        }

        return ans;
    }
}
