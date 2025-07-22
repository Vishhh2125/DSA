class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n =piles.length;
        int lo=1;
         int hi=0;
         
        for(int i=0;i<n;i++){

          hi=  Math.max(hi,piles[i]);

        }

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int hrs=0;
            for(int i=0;i<n;i++){

                hrs+=  Math.ceil((double)piles[i]/mid);

            }

            if(hrs<=h){
                //this is the ans but teherf any be other an in left go left 

                hi=mid-1;
            }else{

                //its grestes than the liit just to less speed increase speed 
                lo=mid+1;
            }
        }


        return lo;
        
    }
}