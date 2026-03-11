class Solution {
    public int bitwiseComplement(int n) {

        if(n==0)  return 1;
        if(n==1)  return 0 ;


      int  mask =0;
       
       int k =0;
        int temp =n;
       while(temp > 0){
    k++;
    temp >>= 1;
}


      for(int i = 0; i < k; i++){
            mask = mask + (1 << i);
        }



        return (n ^ mask);
        
    }
}