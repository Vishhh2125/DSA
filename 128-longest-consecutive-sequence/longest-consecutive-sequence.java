class Solution {
    public int longestConsecutive(int[] nums) {


        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        } 


        
        int max=0;

        for(int num :set){

            if(!set.contains(num-1)){
                // this can be called as starting ele
                  int number=num;
                  int count=0;
                while(set.contains(number)){
                   count++;
                   number++;
                }
                max=Math.max(count,max);
            }
        }


        return max;
        
    }
}