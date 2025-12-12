class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int max = 0;

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            int current = (i == n) ? 0 : arr[i];

            while (!st.isEmpty() && current < arr[st.peek()]) {
                int top = st.pop();       // height index
                int height = arr[top];

                // width depends on stack after popping
                int width = st.isEmpty() ? i : (i - st.peek() - 1);

                max = Math.max(max, height * width);
            }

            st.push(i);
        }

        return max;
    }
}
