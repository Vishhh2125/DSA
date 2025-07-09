class Solution {
    public int maximumUniqueSubarray(int[] arr) {

        int n =arr.length;

        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        int i=0;

        for(int j=0;j<n;j++){

            map.put(arr[j],map.getOrDefault(arr[j],0)+1);

            sum+=arr[j];


            if(map.get(arr[j])>1){

                while(map.get(arr[j])>1){

                    
                        sum-=arr[i];
                        
                        map.put(arr[i],map.get(arr[i])-1);
                        i++;

                    
                }
            
            }

          max=  Math.max(max,sum);
            

        }

        return max;
        
    }
}