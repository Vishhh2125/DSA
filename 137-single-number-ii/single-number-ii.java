class Solution {
    public int singleNumber(int[] arr) {

        int ans =0;
        int n =arr.length;

        for(int i=0;i<32;i++){
            int  counter=0;

            for(int j=0;j<n;j++){
                int and= arr[j] & (1<<i);

                if(and!=0){
                    counter++;
                }
            }

            if(counter%3!=0){
                ans=ans ^ (1<<i);
            }
        }

        return ans;
        
    }
}