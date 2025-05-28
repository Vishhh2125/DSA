class Solution {

    public  void reverse(int []arr,int i ,int j ){
             while(i<j){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }
        
    }
    public void rotate(int[] nums, int k) {
        int n =nums.length-1;
        if(k>=n){
            k=k%(nums.length);
        }
        reverse( nums,n-k+1,n);
         reverse( nums,0,n-k);
         reverse(nums,0,n);


        
    }
}