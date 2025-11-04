class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[51]; // since 1 <= nums[i] <= 50

        // Step 1: Initialize frequency for first window
        for (int i = 0; i < k; i++) {
            freq[nums[i]]++;
        }

        // Step 2: Process each window
        for (int i = k; i <= n; i++) {

            // 2.1 Build list of (num, freq)
            java.util.List<int[]> pairs = new java.util.ArrayList<>();
            for (int num = 1; num <= 50; num++) {
                if (freq[num] > 0) {
                    pairs.add(new int[]{num, freq[num]});
                }
            }

            // 2.2 Sort by freq DESC, then num DESC
            pairs.sort((a, b) -> (a[1] == b[1]) ? b[0] - a[0] : b[1] - a[1]);

            // 2.3 Compute x-sum
            int sum = 0;
            for (int j = 0; j < Math.min(x, pairs.size()); j++) {
                sum += pairs.get(j)[0] * pairs.get(j)[1];
            }

            // 2.4 Store answer
            ans[i - k] = sum;

            // 2.5 Slide window (remove old element, add new one)
            if (i < n) {
                freq[nums[i - k]]--; // remove leftmost
                freq[nums[i]]++;     // add new rightmost
            }
        }

        return ans;
    }
}
