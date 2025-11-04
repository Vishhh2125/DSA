class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int xor=0;
        int count=0;
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
      map.put(0,1);
      
      for(int i =0;i<arr.length;i++){
          
          xor^=arr[i];
          
          
          count+= map.getOrDefault(xor ^ k ,0);
          
          map.put(xor,map.getOrDefault(xor,0)+1);
      }
      
      
      return count;
        
        
    }
}