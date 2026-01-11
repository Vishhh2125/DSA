class Solution {
    public int maximalRectangle(char[][] matrix) {
          int rows=matrix.length;
          int cols=matrix[0].length;
        int [][] arr = new int [rows][cols];

       

        for(int j=0;j<cols;j++){
            int count=0;
            for(int i=0;i<rows;i++){
                if(matrix[i][j]=='1'){
                    count++;
                }else{
                    count=0;
                }
                    arr[i][j]=count;

            }
        }

         int ans =0;


        for(int i=0;i<rows;i++){

            ans=  Math.max(ans,area( arr[i]));

        }

        return ans;
        
    }

    public int area(int []arr){
       int n =arr.length;

        int [] nse= new int[n];
        int [] pse= new int [n];


    Stack<Integer> st = new Stack<>();

     //pse
    for(int i=0;i<n;i++){


        while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
            st.pop();
        }

        pse[i]= st.isEmpty() ? -1 :st.peek();
        st.push(i);
    }

    st.clear();
    //nse
      for(int i=n-1;i>=0;i--){


        while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
            st.pop();
        }

        nse[i]= st.isEmpty() ? n :st.peek();
        st.push(i);
    }
    

      int max =0;

      for(int i=0;i<n;i++){

        int height =arr[i];

       int width = nse[i] - pse[i] - 1;

        max=Math.max(max,height*width);

      }

      return max;

    } 
}