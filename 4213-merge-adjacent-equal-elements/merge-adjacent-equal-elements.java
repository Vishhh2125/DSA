class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        

        Deque<Long > st = new ArrayDeque<>();

        

        for(int i=0;i<nums.length;i++){
             long num = (long) nums[i];
            while(!st.isEmpty() && st.peek()==num){

                num+=st.pop();
                

            }

            st.push(num);
        }


        List<Long> ans = new ArrayList<>();

        for(Long num :st){
            ans.add(num);
        }

         Collections.reverse(ans);
        return ans;
    }
}