class Solution {
    public static int minCost(int[] arr) {
        // code here
       PriorityQueue<Integer>  minheap = new PriorityQueue<>((a,b)->a-b);
       
       
       
       for(int i:arr){
           minheap.add(i);
       }
       
       
       int ans=0;

       while(minheap.size() > 1){
           int a= minheap.poll();
           int b =minheap.poll();
           
           int sum =a+b;
           
           
           
           ans+=sum;
            minheap.add(sum);
           
       }
       
       return ans;
    }
}