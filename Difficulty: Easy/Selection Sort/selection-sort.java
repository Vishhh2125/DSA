class Solution {
    void selectionSort(int[] arr) {
        // code here
        
        
        for(int i =0;i<arr.length-1;i++){
            
            int min =i; //considering the start is the smallest 
            
            for(int j=i;j<arr.length;j++){
                
                if(arr[j]<arr[min]){
                    min=j;
                    
                }
            }
            
            if(min!=i){
                //so the first element in taht iteration is not the smallest 
                int temp=arr[i];
                 arr[i]=arr[min];
                arr[min]=temp;
            }
            
        }
    }
}