class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int counter=0;
        int max=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==1) counter++;
            else{

                max=Math.max(max,counter);
                counter=0;
            }
        }

        if(counter!=0) max=Math.max(max,counter);

        return max;
        
    }
}