class Solution {

    public void rotate(int [] arr ,int i,int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public int[] rotateElements(int[] nums, int k) {

        int count=0;


        for(int i=0;i<nums.length;i++){
           
           if(nums[i]>=0) count++;
        }

        if(count<1) return nums; //mean nn negtive is zero or 1 no need for doing anything just return 

        int [] arr = new int [count];
         int m=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>=0){
                arr[m]=nums[i];
                m++;
            }

        }

      k=k%arr.length; //take modulus
     rotate(arr,0,k-1);
     rotate(arr,k,arr.length-1);
     rotate(arr,0,arr.length-1);

     m=0;

     for(int i=0;i<nums.length;i++){
        if(nums[i]>=0){
            nums[i]=arr[m];
            m++;
        }
     }

     return nums;

        
    }
}