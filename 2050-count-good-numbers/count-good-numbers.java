class Solution {

    public long helper(long mod,long n,long x){

        if(n==0) return 1;

        long half= helper(mod,n/2,x);
         

         long ans=0;
        if(n%2==1) {
          ans= ((half * half )%mod )* x %mod;
         
        }else{
            ans=(half*half)%mod;
        }
            
       
       
     
       return ans;
    }
    public int countGoodNumbers(long n) {

       

        long mod=1000000007;


        long evenpos=(n+1)/2;
        long  oddpos = (n)/2;

       return (int)(helper(mod,oddpos,4) * helper(mod,evenpos,5)%mod);


        
        
    }
}