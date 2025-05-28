class Solution {
    public int removeDuplicates(int[] arr) {

        int i=1;
         int current=arr[0];
        int n =arr.length;


        for(int j=0;j<n;j++){

            if(current!=arr[j]){
                current=arr[j];
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;

            }

        }

        return i;
        
    }
}