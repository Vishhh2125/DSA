class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int MOD = 1_000_000_007;

        int[] left_small = new int[n];   // index of previous smaller element
        int[] right_small = new int[n];  // index of next smaller element

        Deque<Integer> st = new ArrayDeque<>();

        // 🔹 Previous Smaller Element (strictly smaller)
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }

            left_small[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // 🔹 Next Smaller Element (smaller or equal)
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            right_small[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

       

       long sum =0;


       for(int i=0;i<arr.length;i++){
        int left= i-left_small[i];
        int right= right_small[i]-i;

         long  local_sum=  (long)arr[i] * left * right;
        sum= (sum +  local_sum)%1000000007;
       }


       return (int) sum;




    }
}
