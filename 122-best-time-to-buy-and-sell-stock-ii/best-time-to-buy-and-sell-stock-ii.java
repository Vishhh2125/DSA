class Solution {
    public int maxProfit(int[] arr) {

        Deque<Integer> st = new ArrayDeque<>();
         int profit=0;
        for(int i=0;i<arr.length;i++){


            while(!st.isEmpty()  && arr[i]<=st.peek()){
                 
                 st.pop();

            }

           profit+= st.isEmpty() ? 0 : arr[i]-st.peek();  ;
           //you book the profit just clear the array 
           st.clear();

           st.push(arr[i]); 
        }

        return profit;
        
    }
}