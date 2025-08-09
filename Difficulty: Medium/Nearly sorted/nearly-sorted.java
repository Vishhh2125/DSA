class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        // ArrayList<Integer>  ans= new ArrayList<>();
        int current=0;
        
        
        for(int i=0;i<arr.length;i++){
            
            minheap.add(arr[i]);
            
            if(minheap.size()>k){
                
                
                arr[current]=minheap.peek();
                 current++;
                
                minheap.poll();
            }
            
            
            
        }
        
        
        while(!minheap.isEmpty()){
            arr[current]=minheap.peek();
            current++;
            minheap.poll();
        }
        
        
        
        
        
        
        
        
    }
}
