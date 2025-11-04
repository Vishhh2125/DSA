class Solution {
     
     
     static int merge(int [] arr,int i,int mid,int j){
         
         int[] arr1=new int [mid-i+1];
         int [] arr2= new int  [j-mid];
         
         for (int x = 0; x < arr1.length; x++)
                                        arr1[x] = arr[i + x];
         for (int y = 0; y < arr2.length; y++)
                  arr2[y] = arr[mid + 1 + y];

         
         int c1=0;
         int c2=0;
         int c =i; //start for main array
         int count=0;
         while(c1<arr1.length && c2 < arr2.length){
             
             if(arr1[c1]<=arr2[c2]){
                 
                 arr[c]=arr1[c1];
                 c++;
                 c1++;
                 
                 
             }else{
                 
                 count+=arr1.length-c1;
                 arr[c]=arr2[c2];
                 c++;
                 c2++;
                 
                 
             }
         }
         
         
         while(c1<arr1.length){
              arr[c]=arr1[c1];
                 c++;
                 c1++;
             
         }
         
         while(c2<arr2.length){
             arr[c]=arr2[c2];
                 c++;
                 c2++;
             
         }
         
         return count;
         
     }
    
    static int sort(int [] arr,int i,int j){
        if(i>=j)  return 0;
        
        int count=0;
        int mid = i+(j-i)/2;
       count+= sort(arr,i,mid);
       count+= sort(arr,mid+1,j);
       count+= merge(arr,i,mid,j);
       
       return count;
    }
    static int inversionCount(int arr[]) {
        // Code Here
       return sort(arr,0,arr.length-1); 
        
        
    }
}