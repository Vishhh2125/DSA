import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue()); // min heap by frequency

        for (Integer key : map.keySet()) {
            minHeap.add(new AbstractMap.SimpleEntry<>(key, map.get(key)));

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] ans = new int[minHeap.size()];
        int i = 0;

        while (!minHeap.isEmpty()) {
            ans[i++] = minHeap.poll().getKey(); // get the number (key)
        }

        return ans;
    }
}
