class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        Set<Integer> set = new HashSet<>();

        for(int num :arr){
            set.add(num);
        }

        
        int num=1;
        int counter=0;

        while(true){

            if(!set.contains(num)) counter++;

            if(counter==k)  return num;

            num++;
        }


    }
}