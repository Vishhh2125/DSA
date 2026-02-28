class Solution {

    public void tobinary(int n ,StringBuilder str ){
      

      StringBuilder temp = new StringBuilder();
    
        while(n>0){

           char ch = (n & 1)==0 ? '0' :'1';

           temp.append(ch);
           n=n>>1;

        }


        str.append(temp.reverse());
    }


    public long todecimal(StringBuilder str){

        long ans =0;
        long mod= 1000000007;

       
        for(int i=0;i<str.length();i++){
            ans=(ans<<1) %mod; //lleft shift 
            if(str.charAt(i)=='1'){
                ans= (ans+1)%mod; //plus one at teh end of teh oth index of number 

            }
        }

        return ans ;
    }
    public int concatenatedBinary(int n) {

        StringBuilder str= new StringBuilder();


        for(int i=1;i<=n; i++){
            tobinary(i,str);
        }

        return (int) todecimal(str);
        
    }
}