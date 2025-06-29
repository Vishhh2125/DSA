class Solution {
    public int trap(int[] arr) {
       int n =arr.length;
        int max=arr[0];
        int [] left= new int [n];
          int [] right= new int [n];


        for(int i=0;i<n;i++){

            max=Math.max(max,arr[i]);
            left[i]=max;


        }

        max=arr[n-1]; 
         for(int i=n-1;i>=0;i--){

            max=Math.max(max,arr[i]);
            right[i]=max;


        }


        int water=0;

         for(int i=0;i<n;i++){

           int temp = Math.min(left[i],right[i]) -arr[i];

           water+=temp;

        }

        return water;
    
        
    }
}