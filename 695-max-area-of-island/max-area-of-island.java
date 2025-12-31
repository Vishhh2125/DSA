class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int m =grid.length;
        int n =grid[0].length;

        boolean [][]visited = new boolean [m][n];

        int [] max = new int [2];
        //  max[0] is max 
        //max[1]  is count 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(grid[i][j]==1 && visited[i][j]==false){
                    max[1]=0;//make sur etaht count wehich is max[1 ] is always passed as zero 
                    dfs(i,j,grid,visited,max);
                }
            }
        }

        return max[0];
        
    }

    public void  dfs(int i,int j ,int[][] grid,boolean [][]visited,int []max){

        visited[i][j]=true;

        int[] cols={-1,0,1,0};
        int [] rows={0,-1,0,1};
               max[1]++;
               max[0]=Math.max(max[0],max[1]);//count for max 

        for(int k=0;k<cols.length;k++){
               int row = i + rows[k];
               int col = j + cols[k];


             if(col>=0 && col<grid[0].length && row>=0 && row<grid.length &&
                grid[row][col]==1 && visited[row][col]==false){
                //it should be with in the matrix contraint and the ceel should be zero and nonvisited
                dfs(row,col,grid,visited,max); 

            }
        }

    }
}