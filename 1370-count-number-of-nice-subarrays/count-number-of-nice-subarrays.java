class Solution {
    public int numberOfSubarrays(int[] arr, int k) {



        int count=0;

        int odd=0;


        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);


        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                odd++;
            }

            if(map.containsKey(odd-k)){
                count+=map.get(odd-k);
            }


            map.put(odd,map.getOrDefault(odd,0)+1);
        }

        return count;
    }
}