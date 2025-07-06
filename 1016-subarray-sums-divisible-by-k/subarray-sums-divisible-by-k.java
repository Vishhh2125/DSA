class Solution {
    public int subarraysDivByK(int[] arr, int k) {


        // (arr[j]-arr[i])%k==0

        // arr[i]%k=arr[j]%k   ----->this is the conditin if any ith index mod i same to pevious ten it is the one subarry with valid sum condition 

        int n =arr.length;

    Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        int count=0;
        // handel first codition
         int sum=0;
        for(int i =0;i<n;i++){
            sum+=arr[i];

            // int mod=sum%k;
             int mod = (sum % k + k) % k;

            // if(mod<0){
            //     mod=mod+k;

            //    If you're at -2 hours on a 5-hour clock...
            // That's the same as being at 3 hours.

            // }

            count+=map.getOrDefault(mod,0);  

            map.put(mod,map.getOrDefault(mod,0)+1);




        }

        return count;
        
    }
}