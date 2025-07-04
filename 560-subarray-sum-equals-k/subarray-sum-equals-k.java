class Solution {
    public int subarraySum(int[] arr, int k) {


        int sum=0;

        Map<Integer,Integer> map= new HashMap<>();
            map.put(0, 1); 
            int ans=0;
        for(int i=0;i<arr.length;i++){
                  sum+=arr[i];
            if(map.containsKey(sum-k)){

                ans+=map.get(sum-k);

                

            }

            if(map.containsKey(sum)){
                int count=map.get(sum);

                map.put(sum,++count);
            }else{
                map.put(sum,1);
            }

        }

        return ans;
        
    }
}