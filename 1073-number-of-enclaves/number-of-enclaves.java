class Solution {

    public int count =0;
    public int numEnclaves(int[][] grid) {

        int m= grid.length;
        int n =grid[0].length;


        boolean [][]visited= new boolean[m][n];

        //lest visited all the boundary conncted cells and do not add their count

        //first row

        for(int j=0;j<n;j++){
          if(!visited[0][j] && grid[0][j]==1){
            dfs(0,j,grid,visited,true);
          }     

        }
         //last row 
         for(int j=0;j<n;j++){
          if(!visited[m-1][j] && grid[m-1][j]==1){
            dfs(m-1,j,grid,visited,true);
          }     

        }

        //first col 
        for(int i=0;i<m;i++){
            if(!visited[i][0] && grid[i][0]==1){
               dfs(i,0,grid,visited,true); 
            }
        }
        //last col 

        for(int i=0;i<m;i++){
            if(!visited[i][n-1] && grid[i][n-1]==1){
               dfs(i,n-1,grid,visited,true); 
            }
        }

        //count all remaing 

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]==1){

                dfs(i,j,grid,visited,false);
                }
            }
        }

        
        
        
        return count ;


        
    }

    public void dfs(int i,int j ,int[][] grid,boolean [][]visited,boolean isboundary){

        visited[i][j]=true;

        if(!isboundary){
            count++;
            //is it is not boundary cell then only add 
        }


        int[] cols={-1,0,1,0};
        int[] rows={0,-1,0,1};

        for(int k=0;k<cols.length;k++){

            int col= j+cols[k];
            int row=i+rows[k];

            if(col>=0 && col<grid[0].length && row>=0 && row<grid.length
                && !visited[row][col] && grid[row][col]==1){
                    //all row and col with i the boundary 
                    //the nbr should be not visited and 1
                    dfs(row,col,grid,visited,isboundary);
                }

        }



    }
}