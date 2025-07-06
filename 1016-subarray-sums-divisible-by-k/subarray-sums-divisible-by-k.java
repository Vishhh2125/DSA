class Solution {
    public int subarraysDivByK(int[] arr, int k) {

        int n =arr.length;

    Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        int count=0;
        // handel first codition
         int sum=0;
        for(int i =0;i<n;i++){
            sum+=arr[i];

            int mod=sum%k;

            if(mod<0){
                mod=mod+k;

            //    If you're at -2 hours on a 5-hour clock...
            // That's the same as being at 3 hours.

            }

            count+=map.getOrDefault(mod,0);  

            map.put(mod,map.getOrDefault(mod,0)+1);




        }

        return count;
        
    }
}