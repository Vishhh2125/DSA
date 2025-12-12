class Solution {
    public int largestRectangleArea(int[] arr) {

        int [] left_smallest= new int [arr.length];
        int [] right_smallest= new int  [arr.length];

          Deque<Integer> st = new ArrayDeque<>();
           //for first index -1 index is considered 0 and is smallest 
        for(int i=0;i<arr.length;i++){


            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){

                st.pop();
            }


            left_smallest[i]= st.isEmpty() ? -1 : st.peek();

            st.push(i);



        }


        st.clear();


        for(int i=arr.length-1;i>=0;i--){


            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){

                st.pop();
            }

            right_smallest[i]= st.isEmpty() ? arr.length: st.peek();

            st.push(i);



        }


        //now we have nsl and nsr

         int max=0;
        for(int i=0;i<arr.length;i++){


            int width = right_smallest[i]-left_smallest[i]-1;

            int height =arr[i];

            int area= width * height ;


             max= Math.max(area,max);


        }



        return  max;


        
    }
}