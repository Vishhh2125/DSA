class Solution {

    void reverse(int [] arr,int i ,int j){
        int lo=i;
        int hi=j;
        while(lo<hi){

            int temp =arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo++;
            hi--;

        }
    }
    public void nextPermutation(int[] arr) {
        int index=-1;
        for(int i=arr.length-2;i>=0;i--){
           

           if(arr[i]<arr[i+1]){
            index=i;
            break;

           }

        }
        //if ther is no index mean the array is in dec order reverse teh whle array to get te smallest 

        if(index==-1){
            //revere all array 
            reverse(arr,0,arr.length-1);
            return ;
        }
        

        for(int i=arr.length-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        reverse(arr,index+1,arr.length-1);

        


        
        
    }
}