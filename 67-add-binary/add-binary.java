class Solution {
    public String addBinary(String a, String b) {

        int i=a.length()-1;
        int j=b.length()-1;


        int n=Math.max(a.length(),b.length());
          int carry=0;
          StringBuilder ans= new StringBuilder();
        for(int k=0;k<n;k++){
             
            int num1=0;
            int num2=0;
              int sum =0;
            if(i>=0){
                num1=a.charAt(i)-'0';
                i--;
            }

            if(j>=0){
                num2=b.charAt(j)-'0';
                j--;
            }
            sum=num1+num2;
           if(carry==1){
                if(sum==2 ){

                    ans.append("1");
                    carry=1;
                }else{
                    //add carry 
                    sum=sum+carry ;
                    if(sum==2){
                       carry=1;
                       sum=0;
                    }else{
                    carry=0;

                    }
                    ans.append(sum+"");
                }
           }else{
            //carry==0

            if(sum==2){
                ans.append("0");
                carry=1;
            }else{

                sum=sum+carry;
                if(sum==2){
                    sum=0;
                    carry=1;
                }else{
                carry=0;

                }
                ans.append(sum+"");
            }
           }


            
        }

        if(carry==1) ans.append("1");

        return ans.reverse().toString();
        
    }

    
}