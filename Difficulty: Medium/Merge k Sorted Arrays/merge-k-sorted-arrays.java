class Solution {
    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        // Write your code here.
        
    
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b)->a-b);
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i =0;i<K;i++){
            for(int j=0;j<K;j++){
                
                minheap.add(arr[j][i]);
            }
         ans.add(minheap.poll());
         
        }
        
        
        while(!minheap.isEmpty()){
            ans.add(minheap.poll());
        }
        
        
        return ans;
    }
}