class Solution {
    public int minSubArrayLen(int target, int[] arr) {
            
            int min=Integer.MAX_VALUE;
            int n =arr.length;

            int i=0;
            int sum=0;

            for(int j =0;j<n;j++){
                sum+=arr[j];




                while(sum>=target){

                    min=Math.min(min,j-i+1);
                        sum-=arr[i];
                        i++;
                }

                


              


            }
           if(min==Integer.MAX_VALUE) return 0;

        return min;
        
    }
}