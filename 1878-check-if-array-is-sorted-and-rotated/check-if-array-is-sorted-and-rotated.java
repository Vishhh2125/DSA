class Solution {
    public boolean check(int[] nums) {

        int count =0;
       

       if(nums[0]<nums[nums.length-1]) count++; //for first elelemnt its previous is last 
        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i]<nums[i-1]) count++;
        }

        //check for last and first 

        if(count<=1) return true;
        return false;
        
    }
}