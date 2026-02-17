class Solution {
    public String intToRoman(int num) {
      
      
   int[] nums = {
    1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
};

String[] romans = {
    "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
};


          int i=0;
        StringBuilder ans = new StringBuilder();
          

          for(;i<romans.length;i++){
                  int j =0;
              while(num>=nums[i] && j<3){
                num-=nums[i];
                ans.append(romans[i]);
                j++;
              }
             
          }


          return ans.toString();

      

       



        
        
    }
}