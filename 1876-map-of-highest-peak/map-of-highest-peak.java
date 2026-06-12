class Solution {
    public int[][] highestPeak(int[][] mat) {

           int m =mat.length;
        int n =mat[0].length;
        boolean  [][] visited= new boolean [m] [n];

                Deque<int []> q = new ArrayDeque<>();




         for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){

                if(mat[i][j]==1){
                
                    q.add(new int []{i,j,0});
                    visited[i][j]=true;
                    mat[i][j]=0;
                }
            }
        }  

        
             int [] rows={0,1,0,-1};
             int  [] cols={1,0,-1,0};


             while(!q.isEmpty()){

            int []  top = q.poll();
            int i=top[0];
            int j =top[1];
            int wt=top[2];


          for(int k =0;k<rows.length;k++){
            int col= j+cols[k];
            int row =i+rows[k];

            
            if( row>=0 && col>=0 && row<m && col<n &&  visited[row][col]==false){
               visited[row][col]=true;
                mat[row][col]=wt+1;
                q.add(new int []{row,col,wt+1});

                
            }
            
         }


        }

        


      return mat;
        

        
    }
}