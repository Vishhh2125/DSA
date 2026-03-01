class Solution {
     public int cost =0;
      

      public void helper(int n ){
        if(n==1)  return ;
         int num1 =0;
         int num2 =0;

       if(n%2==1){
        num1=(n+1)/2;
        
       }else{
        num1=n/2;
       }
       num2=n/2;

       cost += num1*num2;
       helper(num1);
       helper(num2);
      }
    public int minCost(int n) {

        helper(n);
        return cost ;

      
        
    }
}