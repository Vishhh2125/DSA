class Solution {
    public int[] nextGreaterElements(int[] nums) {

         int n =nums.length;
        int [] ans = new int [n];
        


        Deque<Integer> st = new ArrayDeque<>();

        for(int i= (2*n)-1;i>=0;i--){

            int num = nums[i%n];


            while(!st.isEmpty() && num>=nums[st.peek()]){


                st.pop();

                


            }

            if(st.isEmpty()){

                ans[i%n]=-1;
            }else{

                ans[i%n]=nums[st.peek()];
            }


            st.push(i%n);



        }


        return ans ;


        
    }
}