class Solution {
    public long countSubarrays(int[] nums, long k) {

        Deque<Integer> NSE = new ArrayDeque<>(); // min deque
        Deque<Integer> NGE = new ArrayDeque<>(); // max deque

        int i = 0;
        long ans = 0;

        for (int j = 0; j < nums.length; j++) {

            // Maintain increasing order for minimum
            while (!NSE.isEmpty() && nums[j] <= nums[NSE.peekFirst()]) {
                NSE.pollFirst();
            }
            NSE.offerFirst(j);

            // Maintain decreasing order for maximum
            while (!NGE.isEmpty() && nums[j] >= nums[NGE.peekFirst()]) {
                NGE.pollFirst();
            }
            NGE.offerFirst(j);

            // Shrink window if cost > k
            while (!NSE.isEmpty() && !NGE.isEmpty() &&
                   (long)(nums[NGE.peekLast()] - nums[NSE.peekLast()]) * (j - i + 1) > k) {

                if (NSE.peekLast() == i) NSE.pollLast();
                if (NGE.peekLast() == i) NGE.pollLast();

                i++;
            }

            ans += (j - i + 1);
        }

        return ans;
    }
}
