class Solution {
    public int[] minDistinctFreqPair(int[] nums) {

        Arrays.sort(nums);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
          int x=-1;
          int y =-1;
        for(int i=0;i<nums.length;i++){

            if(x==-1) x=nums[i];
            if( y ==-1 && nums[i]!=x && map.get(x)!=map.get(nums[i])){

                y=nums[i];
            }




            
        }

        if(x==-1 || y==-1 )  return new int []{-1,-1};

        return new int []{x,y};
    }
}