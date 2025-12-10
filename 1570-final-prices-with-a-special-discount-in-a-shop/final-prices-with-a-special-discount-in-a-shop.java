class Solution {
    public int[] finalPrices(int[] prices) {

         int n =prices.length;
        Deque<Integer> st= new ArrayDeque<>();
        int [] ans= new int[n]; 


        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()  && prices[i]<prices[st.peek()]){
                st.pop();
            }

            int discount= st.isEmpty() ? 0 :prices[st.peek()];

            ans[i]=prices[i]-discount;

            st.push(i);

        }

        return ans ;
        
    }
}