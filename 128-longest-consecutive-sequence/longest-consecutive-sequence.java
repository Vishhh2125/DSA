class Solution {
    public int longestConsecutive(int[] arr) {
    
        Set<Integer> set = new HashSet<>();
        

        
    

        for(int i=0;i<arr.length;i++){
           set.add(arr[i]);
        }
        int max=0;
        

        for(Integer num: set){

              if(!set.contains(num-1)){
                // num can be considered as starting 
                int  count=1;
                int current=num;
                while(set.contains(current+1)){
                    count++;
                    current++;

                }
                    max=Math.max(count,max);
              }

            
        }

      

      

        return max ;
        
    }
}