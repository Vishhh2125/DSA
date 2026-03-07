class Solution {


    public int helper(int [][]grid,int i ,int j ,int [][] dp,int m ,int n ){

        if(i>=m || j>=n)  return Integer.MAX_VALUE-200; //returning 300 beacuse tehmax [i][j] can be 200 so taking our of bound value but not overflow one 

        if(i==m-1 && j==n-1)  return grid[i][j];
        
         if(dp[i][j]!=-1) return dp[i][j];

        int right = grid[i][j] + helper(grid,i,j+1,dp,m,n);
        int down = grid[i][j]+helper(grid,i+1,j,dp,m,n);


        return dp[i][j]=Math.min(right,down );
    }
    public int minPathSum(int[][] grid) {
        

        int m =grid.length;
        int n =grid[0].length;

        int [][]dp = new int [m][n];

        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(grid,0,0,dp,m,n);
    }
}