class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;

            // Pop all shorter heights → all are visible
            while (!st.isEmpty() && st.peek() < heights[i]) {
                st.pop();
                count++;
            }

            // If one taller remains, it is also visible
            if (!st.isEmpty()) count++;

            ans[i] = count;

            // Push current height
            st.push(heights[i]);
        }

        return ans;
    }
}
