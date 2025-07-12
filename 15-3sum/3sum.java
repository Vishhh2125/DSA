class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

            Arrays.sort(arr);
          List<List<Integer>> result= new ArrayList<>();

          int sum=0;
            for(int i=0;i<arr.length-2;i++){

                if(i>0 && arr[i]==arr[i-1] )  continue;

                int j =i+1;
                int k =arr.length-1;

                while(j<k){

                    
                
                sum=arr[j]+arr[k]+arr[i];

                if(sum==0){

                    List<Integer> ans= new ArrayList<>();

                    ans.add(arr[j]);
                     ans.add(arr[k]);
                      ans.add(arr[i]);

                      result.add(ans);
                      j++;
                      k--;

                      while(j<k && arr[j]==arr[j-1])  j++;
                     while( j<k &&arr[k]==arr[k+1]  )  k--;


                }else if(sum>0){
                    k--;
                    
                }else{
                    j++;
                }

                

                
            }

                
            } 

        return result;

        
    }
}