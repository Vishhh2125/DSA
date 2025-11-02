class Solution {

    public void swap ( int[]arr ,int i ,int j ){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] rearrangeArray(int[] arr) {

        int i=0;
        int j =1;

        int c=0;
        int [] ans= new int[arr.length];

        while(c<arr.length){

            if(arr[c]>0){
                //swap with positive
               ans[i]=arr[c];
                i=i+2;


            }else{
               ans[j]=arr[c]; 
                j=j+2;
            }
            c++;
        }

        return ans;
        
    }
}