class Solution {

    public int noOfSubArray(int [] arr ,int k){

         HashMap<Integer,Integer> map = new HashMap<>();

            int j=0;

            int count=0;
            for(int i=0;i<arr.length;i++){

                map.put(arr[i],map.getOrDefault(arr[i],0)+1);



                while(map.size()>k){

                   
                  
                  map.put(arr[j],map.get(arr[j])-1);

                  if(map.get(arr[j])==0) map.remove(arr[j]);
                  j++;

                    
                }

                 count+=i-j+1;




            }

            return count;

    }
    public int subarraysWithKDistinct(int[] arr, int k) {


       int ans = noOfSubArray(arr,k)- noOfSubArray(arr,k-1);

       return ans ;
          

     
        
    }
}