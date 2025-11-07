class Solution {

    public void reverse(int [] arr,int i ,int j ){

        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] arr) {

            int n =arr.length;
        int pivot_index=-1;


        for(int i=n-2;i>=0;i--){

            if(arr[i]<arr[i+1]) {
                pivot_index=i;
                break;
            }


        }


        if(pivot_index==-1){
            //means no pivot so rever full arr 
            reverse(arr,0,n-1);
            return ;
        }


         int i=n-1;
        for(;i>=pivot_index;i--){

            if(arr[i]>arr[pivot_index]) break;
        }


        int temp=arr[i];
        arr[i]=arr[pivot_index];
        arr[pivot_index]=temp;


        reverse(arr,pivot_index+1,n-1);








        
    }
}