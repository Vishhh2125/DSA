class Solution {
    public boolean lemonadeChange(int[] bills) {

          int five=0;
          int  ten =0;

        for(int i=0;i<bills.length;i++){

            int amount=bills[i];

            if(amount ==5){

                five++;

            }
            else if(amount==10){

                ten++;
                five--;
            }
             else if(amount==20){

                if(ten>=1){
                    ten--;
                    five--;
                }else{
                  five=five-3;
                }
            }

            if(five<0)  return false;
        }
         return true ;
    }
}