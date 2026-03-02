class Solution {

    public int helper(int n ,int [] dp ){

        if(n==1)  return 1;
        if(n==2) return 2;


        if(dp[n]!=-1)  return dp[n];


        dp[n] =helper(n-1,dp) + helper(n-2,dp);

        return dp[n];
    }
    public int climbStairs(int n) {

        int [] arr = new int [n+1];

        Arrays.fill(arr,-1);

        return helper(n,arr);


        
    }
}