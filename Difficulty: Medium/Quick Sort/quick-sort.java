class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high)  return ;
        
        int pivot= high;
        
        int j =high-1;
        int i=low;
        while(i<=j){
            
            if(arr[i]<arr[pivot]) i++;
            else {
                
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
            }
        }

        
        
        int temp =arr[pivot];
         arr[pivot]=arr[i];
         arr[i]=temp;
         
         quickSort(arr,low,i-1);
         quickSort(arr,i+1,high);
        
        
    }

    
}