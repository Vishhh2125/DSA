class Solution {
    
    
    public int helper(int mat [][] ,int prev,int row ,int[][]dp){
        if(row>=mat.length)  return 0 ;
        
        
        int max=-1;
        
        if(dp[row][prev]!=-1) return dp[row][prev];
        for(int i=0;i<3;i++){
            
            if(i!=prev){
                
                int sol = mat[row][i]+ helper(mat ,i,row+1,dp);
                max=Math.max(sol,max);
            }
            
            
        }
        
        return  dp[row][prev]=max ;
    }
    public int maximumPoints(int mat[][]) {
        // code here
        int m = mat.length;
        int n =mat[0].length;
        int [][]dp = new int [m][3];
        
        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        int max= mat[0][0]+helper(mat,0,1,dp);
        max=Math.max(max,mat[0][1]+helper(mat,1,1,dp));
        max=Math.max(max,mat[0][2]+helper(mat,2,1,dp));
        
        return max;
        
        
    }
}