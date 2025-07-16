class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {


        int sum=0;
        int count=0;

        Map <Integer,Integer> map = new HashMap<>();


        map.put(0,1);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(map.containsKey(sum-goal)){

                count+=map.get(sum-goal);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }



        return count;
        
    }
}