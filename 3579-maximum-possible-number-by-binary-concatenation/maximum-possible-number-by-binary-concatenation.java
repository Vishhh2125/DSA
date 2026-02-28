class Solution {


    public String tobinary(int num ){

        StringBuilder str = new StringBuilder();

        while(num>0){

            str.append((num & 1)==1 ? '1':'0');
            num=num>>1;

        }

        return str.reverse().toString();

    }


     public int concat(String a ,String b ,String c){

        int num =0;
       
       for(int i=0;i<a.length();i++){
          num =num<<1;

          if(a.charAt(i)=='1'){
            num =num+1;
          }
       }

        for(int i=0;i<b.length();i++){
          num =num<<1;

          if(b.charAt(i)=='1'){
            num =num+1;
          }
       }

        for(int i=0;i<c.length();i++){
          num =num<<1;

          if(c.charAt(i)=='1'){
            num =num+1;
          }
       }

       return num ;
     }
    public int maxGoodNumber(int[] nums) {


        String a = tobinary(nums[0]);
        String b = tobinary(nums[1]);
        String c = tobinary(nums[2]);


        int max=0;


        max= Math.max(concat(a,b,c),max);
        max= Math.max(concat(a,c,b),max);
        max= Math.max(concat(b,a,c),max);
        max= Math.max(concat(b,c,a),max);
        max= Math.max(concat(c,b,a),max);
        max= Math.max(concat(c,a,b),max);





      return max;



        
    }
}