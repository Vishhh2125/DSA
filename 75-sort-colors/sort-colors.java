class Solution {
    public void swap(int i ,int j ,int [] arr){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
          int i =0;
        int j =nums.length-1;

        int current =0;


        while(current<=j){
            if(nums[current]==0){
                swap(current,i,nums);
                i++;
                current++;
                
            }else if(nums[current]==1){
                //no need to swap in  middle position 
                current++;
            }else {
                swap(j,current,nums);
                j--;
                // current++;
            }
        }

    
        
    }
}