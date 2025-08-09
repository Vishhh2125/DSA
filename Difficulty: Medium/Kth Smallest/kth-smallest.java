// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        
        
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            maxheap.add(arr[i]);
            
            
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        
        
        return maxheap.peek();
    }
}
