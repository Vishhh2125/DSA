class Solution {
    public int[] asteroidCollision(int[] arr) {
        

       int n= arr.length;
       Stack<Integer> st = new Stack<>();


       for(int i=0;i<n;i++){

        boolean flag=false;

        while(!st.isEmpty() ){

            if(st.peek() > 0 && arr[i] < 0){
                //opp sign 

                if(Math.abs(st.peek())>Math.abs(arr[i])){
                    flag=true;
                    break;
                }else if(Math.abs(st.peek())<Math.abs(arr[i])){
                    //peek one destppryed
                    st.pop();
                }else{
                    //both are destorryed 

                    st.pop();
                    flag=true;
                    break;
                }
            }else{
                //no opp sign
                flag=false;
                break;
            }

        }

        if(flag==false){
            st.push(arr[i]);
        }

       }
       
        int n1=st.size();
       int[] ans = new int[n1];

       for(int i =n1-1;i>=0;i--){
        ans[i]=st.pop();
        
       }
     return ans;

    }
}