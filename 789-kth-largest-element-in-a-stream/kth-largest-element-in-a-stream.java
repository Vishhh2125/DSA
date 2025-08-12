class KthLargest {

   private int k;
    private PriorityQueue<Integer> minheap;

    public KthLargest(int k, int[] nums) {
        
      this.k=k;
        minheap= new PriorityQueue<>((a,b)->a-b);


        //heapify

        for(int i=0;i<nums.length;i++){
            
            minheap.add(nums[i]);

            if(minheap.size()>k){

                minheap.poll();
            }


        }

        
        
        
    }
    
    public int add(int val) {

        minheap.add(val);

        if(minheap.size()>k){
          minheap.poll();
        }
       

        return minheap.peek();

      

        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */