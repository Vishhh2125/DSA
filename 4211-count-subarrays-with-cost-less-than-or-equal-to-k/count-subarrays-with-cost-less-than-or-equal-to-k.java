class Solution {
    public long countSubarrays(int[] nums, long k) {


         PriorityQueue<int[]> minHeap =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> maxHeap =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);
         

          int i = 0;
        long ans = 0;


         for (int j = 0; j < nums.length; j++) {

              minHeap.offer(new int[]{nums[j], j});
            maxHeap.offer(new int[]{nums[j], j});



                while (minHeap.peek()[1] < i) minHeap.poll();
                while (maxHeap.peek()[1] < i) maxHeap.poll();


                while((long)(maxHeap.peek()[0] - minHeap.peek()[0]) * (j - i + 1) >k){

                        i++;

                    while (minHeap.peek()[1] < i) minHeap.poll();
                    while (maxHeap.peek()[1] < i) maxHeap.poll();



                }

         ans += (j - i + 1);

         }
        return ans ;
    }
}