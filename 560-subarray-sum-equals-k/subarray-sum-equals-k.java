class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);   //zero sum subaarya we have 1 intiila case
        
         int ans =0;
         int sum =0;
        for(int j =0;j<nums.length;j++){
          
          sum+=nums[j];

          //check for conatine how many num[i]=num[j](sum)-k

          if(map.containsKey(sum-k)){

             ans+=map.get(sum-k);
          }

          //add the currnets um in ahshmap 

          map.put(sum,map.getOrDefault(sum,0)+1);

        }



        return ans ;
        
        
    }
}