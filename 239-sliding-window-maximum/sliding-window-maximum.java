class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {


       PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0]) // max-heap by value
        );        

        ArrayList<Integer> ans = new ArrayList<>();



          int i=0;

        for(int j=0;j<nums.length;j++){

             pq.add(new int[]{nums[j], j});


             if(j-i+1==k){
                //window size reaced k 

                 while(!pq.isEmpty() && pq.peek()[1]<i){

                    pq.poll();
                 }

                 ans.add(pq.peek()[0]);

                 i++;
             }

        }




        

           


          int [] ans1 = new int [ans.size()];

          int c=0;

          for(Integer num : ans){

            ans1[c]=num;
            c++;
          }

          return ans1;
        
    }
}