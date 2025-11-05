class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int lo=1;
        int hi =piles[0];

        for(int pile:piles ){
            hi=Math.max(pile,hi);
        }
         int ans=0;
        while(lo<=hi){

            int mid = lo+ (hi-lo)/2; // mid is my choosen answer 

            int hrs=0;

            for(int i=0;i<piles.length;i++ ){

                hrs+=Math.ceil((double)piles[i]/mid);
            }


            if(hrs<=h){

              //this can be one of  teh ans but move left to get teh ans 

              ans=mid;
              hi=mid-1;

              

            }else{
               lo=mid+1;
            }



        }

        return ans;

        
    }
}