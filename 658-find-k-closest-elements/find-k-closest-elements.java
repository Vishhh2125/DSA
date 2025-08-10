import java.util.*;


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {


                PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                int cmp = b.getKey().compareTo(a.getKey());   // Descending key
                if (cmp == 0) {
                    return b.getValue().compareTo(a.getValue());  // Descending value
                }
                return cmp;
            }
        );



        for(int i=0;i<arr.length;i++){
               

      maxHeap.add(new AbstractMap.SimpleEntry<>(Math.abs(arr[i]-x),arr[i]));


      if(maxHeap.size()>k){
        maxHeap.poll();
      }





        }

      ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0;i<k;i++){
            ans.add(maxHeap.peek().getValue());
            maxHeap.poll();
        }

   Collections.sort(ans);

    return ans;

        
    }
}