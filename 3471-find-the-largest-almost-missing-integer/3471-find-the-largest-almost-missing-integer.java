class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Frequency of every number
        int[] freq = new int[51];

        for (int num : nums) {
            freq[num]++;
        }

        // k == 1:
        // Every element itself is a subarray.
        if (k == 1) {
            int ans = -1;

            for (int i = 0; i <= 50; i++) {
                if (freq[i] == 1) {
                    ans = i;
                }
            }

            return ans;
        }

        // k == n:
        // There is only ONE subarray: the entire array.
        // Therefore every distinct number appears in exactly one subarray.
        if (k == n) {
            int ans = -1;

            for (int i = 0; i <= 50; i++) {
                if (freq[i] > 0) {
                    ans = i;
                }
            }

            return ans;
        }

        // 1 < k < n:
        // Only the first and last positions can belong
        // to exactly one k-length subarray.
        int ans = -1;

        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}