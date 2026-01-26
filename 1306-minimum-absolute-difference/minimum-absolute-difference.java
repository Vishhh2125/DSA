class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //for getting the condtion for pair a<b and a-b== minmum so we need to sort tteh arr no matter what 

        Arrays.sort(arr);


        int min =Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(i>0){
                min =Math.min(min,arr[i]-arr[i-1]);
            }
        }

       List<List<Integer>> ans = new ArrayList<>();


       for(int i=0;i<arr.length;i++){
          if(i>0){
            if(arr[i]-arr[i-1] ==min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);

                ans.add(list);
            }
          }
       }


       return ans ;

        
    }
}