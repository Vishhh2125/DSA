class Solution {
    public int maxProduct(int[] arr) {

        int n =arr.length;
         int pre=1;
         int post=1;
         int max=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){

            pre*=arr[i];
            max=Math.max(pre,max);
            post*=arr[n-1-i];
            max=Math.max(post,max);


            if(pre==0){

                pre=1;

            }
            if(post==0){
                post=1;
            }



        }

        return max;
        
    }
}