class Solution {
    public int longestConsecutive(int[] arr) {

        Arrays.sort(arr);

          int count =1;
          int ans=0;


          if(arr.length==0){
            return 0;
          }
        for(int i =0;i<arr.length-1;i++){

            if(arr[i+1]-arr[i]==1){
                count++;
            }
           
            else if(arr[i+1]-arr[i]!=1 && arr[i+1]-arr[i]!=0){

                ans = Math.max(count,ans);
                count=1;
            }

        }
       if(count!=0){
         ans = Math.max(count,ans);

       }

        return ans ;
        
    }
}