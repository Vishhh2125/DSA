class Solution {
    public List<List<Integer>> subsets(int[] arr) {
         List<List<Integer>> ans = new ArrayList <>();
      int bits = arr.length;

      int totalCombination= 1<<bits;


      for(int i=0;i<totalCombination;i++){
         List<Integer> set = new ArrayList<>();

        for(int j =0;j<bits;j++){
            int mask =1<<j;

            if((i & mask) !=0){

                set.add(arr[j]);

            }

        }
                    ans.add(set);

      }


      return ans;

    }
}