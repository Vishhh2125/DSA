class Solution {

    public void rotate(int [] nums,int i ,int j ){

        while(i<j){
            int temp =nums[i];
            nums[i]=nums[j];
            nums[j]= temp  ;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        
      int k = nums.length-2 ;


      while(k>=0 && nums[k]>=nums[k+1]){
        k--;
      }

      if(k<0){
        rotate(nums,0, nums.length-1);
        //beacuse the currnet is teh biggest element form rearrnging the number itself to we need the series bemoes the smallest which is by rveersing all 
      }else{


        int j =nums.length-1;
        while(nums[k]>=nums[j]){
            j--;
        }
        int temp = nums[k];
        nums[k]=nums[j];
        nums[j]=temp;

        rotate(nums,k+1,nums.length-1);

      }




      
 
    
    }
}