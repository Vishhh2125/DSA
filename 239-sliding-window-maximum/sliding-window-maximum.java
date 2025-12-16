class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {


    //    PriorityQueue<int[]> pq = new PriorityQueue<>(
    //         (a, b) -> Integer.compare(b[0], a[0]) // max-heap by value
    //     );        
        Deque<int []> st = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();



          int i=0;

        for(int j=0;j<nums.length;j++){

             

             while(!st.isEmpty() && nums[j]>st.peek()[0]){
                st.pop();
             }

             st.push(new int[]{nums[j], j});
             if(j-i+1==k){
                //window size reaced k 

                 while(!st.isEmpty() && st.peekLast()[1]<i){

                    st.removeLast();
                 }

                 ans.add(st.peekLast()[0]);

                 i++;
             }

        }

          int [] ans1 = new int [ans.size()];

          int c=0;

          for(Integer num : ans){

            ans1[c]=num;
            c++;
          }

          return ans1;
        
    }
}