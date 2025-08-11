// User function Template for Java
import java.util.AbstractMap.SimpleEntry;
class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
                                // number, index
        PriorityQueue<SimpleEntry<Integer,Integer>> minheap= new PriorityQueue<>(
            (a,b)->a.getKey()-b.getKey()
            
            
        );
        
        
        int n = arr.length;
        
        
        for(int i=0;i<n;i++){
            
            minheap.add(new SimpleEntry<>(arr[i],i));
            
            
            
        }
        
        
        int rank=0;
        
        int [] ans= new int[n];
        int last=-1;
        int val=-1;
        
        while(!minheap.isEmpty()){
            
            SimpleEntry<Integer,Integer> top= minheap.poll();
            
            last=val;
            val=top.getKey();
            
            if(last!=val) rank++;
            int index=top.getValue();
            ans[index]=rank;
            
            
            
        }
        
        
        return ans;
        
         
         
         
         
         
         
         
         
         
    }
}
