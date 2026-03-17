class Solution {
    // Function to calculate the number of subsets with a given sum
    
    public int helper(int [] nums,int i ,int target,int[][]dp){
        if(i==0){
            if(target==0 && nums[0]==0)  return 2; //{} and {0}
            if(target==0) return 1 ;
            if(target==nums[0]) return 1;
            
            return 0 ;
            
            
        }
            
            if(dp[i][target]!=-1) return dp[i][target];
             
             
             int take =0;
            if(nums[i]<=target){
                take=helper(nums,i-1,target-nums[i],dp);
            }
            int notake=helper(nums,i-1,target,dp);
            
            return dp[i][target]=take +notake;
    
        
        
    }
    public int perfectSum(int[] nums, int target) {
        // code here
        
        int n = nums.length;
        int [][] dp= new int [n][target+1];
        
        for(int i=0;i<n;i++){
            
            Arrays.fill(dp[i],-1);
        }
        
        return helper(nums,n-1,target,dp);
    }
}