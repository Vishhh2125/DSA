class Solution {
    

    //sort teh number accoridng to teh no of set bits using lamba operators and Arrays.sort or Collections.sort for ArrayList
    public int  countSetBit(int num){
          int count =0;

        while(num!=0){

        num=num & (num -1);
        count++;            

        }

        return count ;
    }
    public int[] sortByBits(int[] arr) {
        

        Integer [] temp = new Integer [arr.length];
        for(int i=0;i<arr.length;i++){

        //    arr[i]=temp[i];
           temp[i]=arr[i];
        }

        Arrays.sort(temp,(a,b)->{

            int countA=countSetBit(a);
            int countB=countSetBit(b);

            if(countA==countB) return a-b;

            return countA-countB;
        });


        for(int i=0;i<arr.length;i++){

           arr[i]=temp[i];
        }

        return arr;


        
    }
}