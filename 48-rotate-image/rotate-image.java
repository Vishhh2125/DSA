class Solution {
    public void rotate(int[][] arr) {

        int n =arr.length;
        int m =arr[0].length;

        //  transpose + reverse each row == roatate 90

        //transpose only when matix is nxn
        for(int i=0;i<n;i++){
            for(int j =0;j<=i;j++){

               int temp = arr[i][j];
                arr[i][j] = arr[j][i];
               arr[j][i] = temp;


            }
        }



        //    reverse the values of each rows 
          for(int i=0;i<n;i++){
            for(int j =0;j<m/2;j++){

             int temp =arr[i][m-j-1];
             arr[i][m-1-j]=arr[i][j];
             arr[i][j]=temp;

            }
        }
        
    }
}