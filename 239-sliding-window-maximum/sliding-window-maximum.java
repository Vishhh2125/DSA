class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0]) // max-heap by value
        );

        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});

            // remove elements outside window
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                ans[idx++] = pq.peek()[0];
            }
        }

        return ans;
    }
}
