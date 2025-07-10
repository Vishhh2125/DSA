class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        //here k=0
        int k=0;
        int sum=0;
        int count=0;
        Map<Integer,Integer> map= new HashMap<>();
        
        
        map.put(0,1); 
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return count;
        
    }
}
