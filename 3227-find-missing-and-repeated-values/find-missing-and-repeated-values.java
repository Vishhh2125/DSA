class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {


        Map<Integer, Integer> map = new HashMap<>();
         int [] ans= new int[2];

         int extra=0;
         int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                sum+=arr[i][j];

                map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);

                if(map.get(arr[i][j])==2){
                    extra=arr[i][j];
                }



            }
        }

        sum-=extra;

        int size= arr[0].length;
        size=size  * size;

        int ideal_sum=(size*(size+1))/2;

        int missing=ideal_sum-sum;

        ans[0]=extra;
        ans[1]=missing;



      return ans;
        
    }
}