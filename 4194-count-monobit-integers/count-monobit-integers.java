class Solution {
    public int countMonobit(int n) {
        

        int count=1; //considering zero as monobit 

        for(int i=1;i<=n;i++){
           
           int num=i;
            
         while(num%2==1){
           num= num>>1;
         }

         if(num==0) count++;

            
        }

        return count;
    }
}