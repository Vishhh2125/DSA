class Solution {

    public int helper(int [][] grid ,int [][]arr,int i,int j,int m ,int n ){

        if(i>=m || j>=n)  return 0 ;
        if(grid[i][j]==1)  return 0;

        if(i==m-1 && j==n-1)  return 1;



        if(arr[i][j]!=-1) return arr[i][j];


        int right= helper(grid,arr,i,j+1,m,n);

        int down =helper(grid,arr,i+1,j,m,n);

        return arr[i][j]=right+down ;

        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {


        int m =obstacleGrid.length;
        int n =obstacleGrid[0].length;

        // if(obstacleGrid[m-1][n-1]==1) return 0;

        // if(obstacleGrid[0][0]==1) return 0 ;

        int [][]arr = new int [m][n];

        for(int i =0;i<m;i++){
            Arrays.fill(arr[i],-1);
        }

        return helper(obstacleGrid,arr,0,0,m,n);
        
    }
}