class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
          int n =cost.length;

          int ans =0;
          int count=0;
        for(int i=n-1;i>=0;i--){

            ans+=cost[i];
            count++;

            if(count==2){
            i--;
            count=0;
            } 


        }


        return ans ;
        
    }
}