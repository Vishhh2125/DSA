// User function Template for Java

class Solution {
    
static void heapify(int[]arr,int current){
    
    int n =arr.length;
    int left= current*2+1;
    int right=current*2+2;
    int largest=current;
    
    
    if(left<n && arr[left]>arr[largest]){
        largest=left;
    }
    
    
     if(right<n && arr[right]>arr[largest]){
        largest=right;
       }
       
       
       
       if(largest!=current){
           int temp=arr[current];
           arr[current]=arr[largest];
           arr[largest]=temp;
           
           heapify(arr,largest);
           
       }
}
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        
        
        int start =(N/2)-1;
        
        
        
        
        for(int i=start;i>=0;i--){
            
            heapify(arr,i);
            
            
            
            
        }
    }
}
