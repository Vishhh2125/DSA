class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //same as next grestest elemnt just we have to check for two times thet if from 2n-1 to 0 
        
        int n =nums.length;
        int [] ans =new int[n];
         Stack<Integer> st= new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int index= i%n;
            while(!st.isEmpty() && st.peek()<=nums[index] ){
                st.pop();
            }

            

            if(st.isEmpty()){
                ans[index]=-1;
            }else{
                ans[index]= st.peek();
            }

            st.push(nums[index]);
        }


        return ans;
        
    }
}