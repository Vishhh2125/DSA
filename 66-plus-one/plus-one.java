class Solution {
    public int[] plusOne(int[] arr) {

       Stack<Integer> st = new Stack<>();
          int n =arr.length;

         arr[n-1]++;
         int carry =0;
         for(int i=n-1;i>=0;i--){
              int num =arr[i];
              num+=carry;

                carry=0;
             if(num==10){

                num=0;
                carry=1;

              }
            st.push(num);
         }

         if(carry==1) st.push(carry); //if carry present just add it inside teh stack 

       int [] ans = new int[st.size()];
         int i=0;
       while(!st.isEmpty()){

            ans[i]=st.pop();
            i++;
       }


       return ans;
        
    }
}