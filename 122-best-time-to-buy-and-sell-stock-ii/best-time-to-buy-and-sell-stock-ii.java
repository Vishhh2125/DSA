class Solution {
    public int maxProfit(int[] arr) {

        int profit=0;
        int buyed=-1;
        for(int i=0;i<arr.length-1;i++){
            
         if(arr[i]>=arr[i+1] ){
            //sell it 
            if(buyed!=-1){
            profit+=arr[i]-buyed;
            buyed=-1;
            }

         }else{
            //price is going to increase

            if(buyed==-1){
                //prices is going to increase 
                buyed=arr[i];
            }
         }

        }

        if(buyed!=-1){

            //sell on last price 
            profit+=arr[arr.length-1]-buyed;
        }

        return profit;
        
    }
}