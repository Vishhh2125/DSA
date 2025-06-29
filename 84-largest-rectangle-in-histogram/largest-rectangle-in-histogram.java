class Solution {
    public int largestRectangleArea(int[] arr) {
      int n= arr.length;
    int [] smallest_right=new int [n];

    int [] smallest_left=new int [n];
    Stack<int []> st = new Stack<>();

    for(int i=0;i<n;i++){

        while(!st.isEmpty() && arr[i]<=st.peek()[0]){
            st.pop();
        }

        if(st.isEmpty()){
            //current o sthe smallest
            smallest_left[i]=-1;
        }else{
            //peek is smalest 

            smallest_left[i]= st.peek()[1];
        }

        st.push(new int[]{arr[i],i});
    }
 
        while(!st.isEmpty()){
            st.pop();
            //empty stack for further uses 
        }




        for(int i=n-1;i>=0;i--){

        while(!st.isEmpty() && arr[i]<=st.peek()[0]){
            st.pop();
        }

        if(st.isEmpty()){
            //current o sthe smallest
            smallest_right[i]=n;
        }else{
            //peek is smalest 

            smallest_right[i]= st.peek()[1];
        }

        st.push(new int[]{arr[i],i});
    }


    int max=0;


    for(int i=0;i<n;i++){
        int right=smallest_right[i];
        int left=smallest_left[i];

        int ans=(right-left-1)* arr[i];
        

        max=Math.max(ans,max);
    }

    return max;



        
    }
}