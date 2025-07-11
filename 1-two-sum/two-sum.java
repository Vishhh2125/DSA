class Solution {
    public int[] twoSum(int[] arr, int target) {

        int n =arr.length;
        int[] ans=new int[2];

        // here we knoow that arr[i]+arr[j]=target;
        //target-arr[j]=arr[i](we will stire th the first occurance of every number in hashmap )

        Map<Integer,Integer> map= new HashMap<>();


        for(int i=0;i<n;i++){
               //condition checking 
            if(map.containsKey(target-arr[i])){
                ans[0]=map.get(target-arr[i]);
                ans[1]=i;

                break;

                
            }

            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
        }

        return ans;
        
    }
}