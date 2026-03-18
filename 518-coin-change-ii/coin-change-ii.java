class Solution {

    public int helper(int []coins ,int rem ,int k ,int[][]dp){
        if(rem==0)  return 1 ;
        if(rem<0)  return 0;


        int count=0;

        if(dp[k][rem]!=-1)  return dp[k][rem];

        for(int i =k;i>=0;i--){

            count+=helper(coins,rem-coins[i],i,dp);
        }



        return dp[k][rem]=count;
    }
    public int change(int amount, int[] coins) {

          int n =coins.length;
          int [] []dp = new int [n][amount+1];
          

          for(int i =0;i<n;i++){
          Arrays.fill(dp[i],-1);

          }

          return helper(coins,amount,n-1,dp);
        
    }
}