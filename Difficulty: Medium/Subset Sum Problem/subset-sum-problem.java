class Solution {
    
    
    public static Boolean helper(int []arr,int i,int sum,int [][]dp ){
        
        if(sum==0)  return true ; //if in middle of arryw egot sum ==0 
        if(i>=arr.length ){
           return false; 
        }
         
         
         if(dp[i][sum]!=-1) {
             if(dp[i][sum]==1) return true;
             else return false;
         }
        boolean take=false;
        if(sum>=arr[i]){
            take=helper(arr,i+1,sum-arr[i],dp);
        }
        
           boolean not_taken=helper(arr,i+1,sum,dp);
           
           dp[i][sum]= ((take || not_taken ) ==true ) ? 1:0;
           return take || not_taken;
       
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
         int n =arr.length;
        int   [][] dp = new int   [n+1][sum+1];
        
        for(int i =0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
           return helper(arr,0,sum,dp);
    }
    
    
    
}