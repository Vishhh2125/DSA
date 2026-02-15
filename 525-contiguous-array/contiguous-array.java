class Solution {
    public int findMaxLength(int[] nums) {

        int sum=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        int max=0;

        for(int j=0;j<nums.length;j++){

            if(nums[j]==0){
                sum--;
            }else{
                sum++;
            }


            if(map.containsKey(sum)){
                int i=map.get(sum);
                max=Math.max(max,j-i);
            }else{

                map.put(sum,j);//first occurance 
            }
        }

        return max;

        
    }
}