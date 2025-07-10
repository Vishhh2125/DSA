class Solution {
    int maxLength(int arr[]) {
        // code here
        
        int sum=0;
        int k=0;
        int max=0;
        
        Map<Integer,Integer> map= new HashMap<>(); 
        // map.put(0,1);
        map.put(0,-1);
        for(int i =0 ;i<arr.length;i++){
            
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                int firstindex=map.get(sum-k);
                
                max=Math.max(max,i-firstindex);
                
                
            }
            
            
            if(!map.containsKey(sum-k)){
                map.put(sum,i);
            }
            
            
        }
        
        return max;
    }
}