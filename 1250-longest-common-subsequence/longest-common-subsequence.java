class Solution {

    public int helper(int i ,int j ,String str1 ,String str2,int [][]dp){


        if(i>=str1.length() || j>=str2.length())  return 0 ;


        if(dp[i][j]!=-1)  return dp[i][j];

        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j]= 1+helper(i+1,j+1,str1,str2,dp);
        }else{

            return dp[i][j]= Math.max(helper(i+1,j,str1,str2,dp),helper(i,j+1,str1,str2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
          int m =text1.length();
          int n =text2.length();
        int [][] dp = new int [m][n];

        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(0,0,text1,text2,dp);
        
    }
}