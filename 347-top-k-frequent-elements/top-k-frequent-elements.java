import java.util.AbstractMap;


class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map= new HashMap<>();

        // ArrayList<Integer>  ans= new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            
        }

        Set<Integer> keyList= map.keySet();

         PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());


        for(Integer key : keyList ){

            maxHeap.add( new AbstractMap.SimpleEntry<>(key,map.get(key)));

            if(maxHeap.size()>k){
                maxHeap.poll();
            }



                 
        }

         

         int [] ans = new int [maxHeap.size()];
   
           int end=maxHeap.size();
        for(int i=0;i<end;i++){


            ans[i]=maxHeap.peek().getKey();
            maxHeap.poll();


            

        }

        return ans;



        
    }
}