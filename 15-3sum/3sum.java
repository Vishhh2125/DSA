class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;


        List<List<Integer>> output= new ArrayList<>();

        for(int i=0;i<n-2;i++){
             while(i>0 && i<n-2 &&arr[i]==arr[i-1]) i++;
            int j=i+1;
            int k=n-1;

            while(j<k){

                while(j>i+1 && j<k && arr[j]==arr[j-1])  j++;
                while(k>n-1 && j<k && arr[k]==arr[k+1]) k--;
                  if(j>=k) break;
                int sum =arr[i]+arr[k]+arr[j];

                if(sum==0){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    ans.add(arr[k]);

                    output.add(ans);

                    j++;
                    k--;
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }


        return output ;
        
    }
}