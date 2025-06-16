class Solution {

    public static int helper(int num,int counter){
       if(num==0)  return counter;

       if(num%2==1)  num=num-1;
       else num=num/2;

       return helper(num,++counter);
    }
    public int numberOfSteps(int num) {



        return helper(num,0);
        
    }
}