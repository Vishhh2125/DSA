// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    
    static void reverse(int [] arr ,int start ,int end ){
        
      while(start<end){
          
          int temp =arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          end--;
          start++;
      }
    }
    static void rotateArr(int arr[], int d) {
        // add your code here
        int size=arr.length;
        d=d%size;
        int mid = d-1; //index based so minus 1 
    //   if(mid==0) return ;
          reverse(arr,0,mid);
          reverse(arr,mid+1,size-1); 
          //here mid+1 is safe beacuse mid will not be size-1 as we are doinng d=d%size when it will be size-1 it will get covverted to 0
          reverse(arr,0,size-1);
          
        
    }
}