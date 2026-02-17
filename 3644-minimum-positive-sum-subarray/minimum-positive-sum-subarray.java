class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min =Integer.MAX_VALUE;



        int i=0;
        int j=0;

        int sum =0;

        for(;j<nums.size();j++){
            sum+=nums.get(j);

            if(j-i+1>r){
                sum-=nums.get(i);
                i++;
            }

           
             int k=i;
              int tempSum = sum;

             while(j-k+1>=l ){
                if(tempSum>0){

                min=Math.min(min,tempSum);
                }
                tempSum-=nums.get(k);
                k++;

             }

               
            }



        

        

        return min==Integer.MAX_VALUE?-1 :min;
        
    }
}