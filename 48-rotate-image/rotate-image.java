class Solution {

    public void rotate(int[][] arr ) {

    int m = arr.length ;
    int n = arr[0].length;

    for(int i=0;i<m;i++){
        for(int j =i+1;j<n;j++){
            //transpose 

            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            
        }
    }

    //revser seach row 

    for(int i=0;i<m;i++){
        for(int j =0;j<n/2;j++){


           int temp=arr[i][j];
            arr[i][j]=arr[i][n-j-1];
            arr[i][n-j-1]=temp;



        }
        }
        
    }
}