class Solution {
    public boolean isTrionic(int[] nums) {


        int i = 0;

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;

      
        if (nums[i] < nums[i + 1]) {
            while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
                i++;
            }
            flag1 = true;
        }

      
        if (flag1 && i < nums.length - 1 && nums[i] > nums[i + 1]) {
            while (i < nums.length - 1 && nums[i] > nums[i + 1]) {
                i++;
            }
            flag2 = true;
        }

     
        if (flag2 && i < nums.length - 1 && nums[i] < nums[i + 1]) {
            while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
                i++;
            }
            flag3 = true;
        }

        return flag1 && flag2 && flag3 && i == nums.length - 1;
    }
}
