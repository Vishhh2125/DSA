class Solution {
    public List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> ans= new ArrayList<>();

        int  n =(int)Math.pow(2,nums.length);
         
        for(int i=0;i<n;i++){
              int num=i;
              List<Integer> list = new ArrayList<>();
            for(int j=nums.length-1;j>=0;j--){

                if(num%2==1){
                   list.add(nums[j]);

                }
                num=num>>1;

            }
             Collections.reverse(list);
            ans.add(list);
        }


        return ans ;
        
    }
}