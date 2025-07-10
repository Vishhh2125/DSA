// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int max=0;
        int sum=0;
        
        Map <Integer,Integer> map=new HashMap<>();
        
        map.put(0,-1); //here instead of giveing count of sum we are giveing the position of first sum
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            //condition checking 
            if(map.containsKey(sum-k)){
                int initialIndex=map.get(sum-k);
                
            max=  Math.max(max,i-initialIndex);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            
            
        }
        
        return max;
    }
}
