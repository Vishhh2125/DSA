class Solution {
    public int[] singleNumber(int[] arr) {

        int ans =0;
        int n =arr.length;
        for(int i=0;i<n;i++){

            ans^=arr[i];

        }
        
      int temp = ans & (ans - 1);        
int mask = ans ^ temp;            



        int bucket1=0;
        int bucket2=0;

        for(int i=0;i<n;i++){
              int temp1 = arr[i] & mask;
            if(temp1 !=0){
                bucket1^=arr[i];
            }else{
                bucket2^=arr[i];

            }
        }
        int [] answer={bucket1,bucket2};

        return answer;
        
    }
}