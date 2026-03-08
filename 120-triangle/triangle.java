class Solution {

    public int helper(List<List<Integer>> triangle,int i ,int j ,int [][]dp  ){

        if(j<0 || j>=triangle.get(i).size()) return Integer.MAX_VALUE;
        if(i==triangle.size()-1)  return triangle.get(i).get(j);
        


        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int right = triangle.get(i).get(j) + helper(triangle,i+1,j+1,dp);
        int down =triangle.get(i).get(j) + helper(triangle,i+1,j,dp);


        return dp[i][j]=Math.min(right,down );

    }
    public int minimumTotal(List<List<Integer>> triangle) {


        int n= triangle.size();

        int [][] dp = new int [n][n];

        for(int i=0;i<n;i++){
  Arrays.fill(dp[i], Integer.MAX_VALUE);        }

        return helper(triangle,0,0,dp);
        
    }
}