class Solution {
    public int fib(int n) {

       if(n==0)  return 0;
       if(n==1)  return   1;

       int current=1;
        
        int i =0;
        int j =1;
    



          while(current!=n){

            int fibo =i+j;

            i=j;
            j=fibo;
            current++;

          }

          return j ;


    }
}