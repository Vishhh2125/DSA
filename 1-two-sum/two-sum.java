class Solution {
    public int[] twoSum(int[] arr, int target) {

        HashMap<Integer ,Integer> map = new HashMap<>();
         int [] ans = new int[2];
        for(int j =0;j<arr.length;j++){
             
           if(map.containsKey(target-arr[j])){

              ans[0]=j;

              ans[1]=map.get(target-arr[j]);
            

           }
           map.put(arr[j],j);
        }
       return ans ;
        
    }
}