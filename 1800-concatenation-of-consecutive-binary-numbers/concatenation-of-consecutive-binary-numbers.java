class Solution {

    public void tobinary(StringBuilder str ,int n ){

          StringBuilder temp = new StringBuilder();

        while(n>0){

            temp.append(n%2);
            n=n/2;
        }

        str.append(temp.reverse());
    }

    public long todecimal(StringBuilder str ){
        long ans =0;
        int mod = 1000000007;
          int n=str.length();


          for(int i=0;i<n;i++){

                    ans = ((ans << 1) % mod);   // shift safely with mod


            if(str.charAt(i)=='1'){

               ans=(ans+1) %mod;
            }

           
          }

          return ans ;

      
    }
    public int concatenatedBinary(int n) {


        StringBuilder str= new StringBuilder();


        for(int i=1;i<=n;i++){
        tobinary(str,i);

        }


        return (int ) todecimal(str);


          
        
    }
}