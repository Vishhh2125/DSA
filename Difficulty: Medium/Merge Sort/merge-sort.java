class Solution {
    
    

    void mergeSort(int arr[], int l, int r) {
        // code here
        
        if(l>=r)  return ;
        
        int mid = l+(r-l)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        int [] arr1=new int [mid-l+1];
        int [] arr2= new int [r-mid];
        
        
        int i1=0;
        int i2=0;
        for(int i=l;i<=r;i++){
            
            if(i<=mid){
                arr1[i1]=arr[i];
                i1++;
            }else{
                arr2[i2]=arr[i];
                i2++;
            }
        }

     //merge two array 
        
        i1=0;
        i2=0;
        int c=l;
        
        while(i1<arr1.length && i2<arr2.length){
             
             if(arr1[i1]<arr2[i2]){
                 arr[c]=arr1[i1];
                 i1++;
                 c++;
             }else{
                 
                 arr[c]=arr2[i2];
                 i2++;
                 c++;
             }
             
        }
        
        
        while(i1<arr1.length){
            arr[c]=arr1[i1];
                 i1++;
                 c++;
            
        }
        
        while(i2<arr2.length){
            arr[c]=arr2[i2];
                 i2++;
                 c++;
            
        }
        
        
        
        
    }
}