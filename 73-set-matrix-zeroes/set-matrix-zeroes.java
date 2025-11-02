class Solution {
    public void setZeroes(int[][] arr) {

        int m =arr.length;
        int n =arr[0].length;

        int [] row= new int [m];
        int [] col= new int [n];


        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){

                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i =0;i<m;i++){

            if(row[i]==1){
                //make that row to zero 
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }

        for(int j=0;j<n;j++){

            if(col[j]==1){
                //make that row to zero 
                for(int i=0;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        
    }
}