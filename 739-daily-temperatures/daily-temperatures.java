class Solution {
    public int[] dailyTemperatures(int[] temp) {
             int n = temp.length;

        int [] ans = new int [n];



        Deque<Integer> st = new ArrayDeque<>();



        for(int i=n-1;i>=0;i--){

            

            while(!st.isEmpty()  && temp[i]>=temp[st.peek()] ){

                st.pop();
            }


           ans[i]= st.isEmpty() ? 0: st.peek()-i;  //push difference of days that si diff of index 

           st.push(i);
        }



        return ans ;



        
    }
}