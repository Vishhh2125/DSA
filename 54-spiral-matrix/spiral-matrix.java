class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int minc=0;
        int maxc=arr[0].length-1;
        int minr=0;
        int maxr=arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
 
        while(minc<=maxc && minr <=maxr){


        //from left tto right 
         //i=minr
         //j=minc to maxc


         for(int j=minc ;j<=maxc;j++){
            ans.add(arr[minr][j]);


         }
            minr++;

         //from top to bottom 
         // i=minr to maxr 
         // j=maxc

         for(int i=minr ;i<=maxr;i++){
            ans.add(arr[i][maxc]);
         }
         maxc--;


         //from right to left 
         //i=maxr
         //j=maxc to minc

          if (minr <= maxr) {

         for(int j=maxc;j>=minc;j--){

            ans.add(arr[maxr][j]);
         }

         maxr--;

          }


         //from bottom to top 
         //i= maxr to min r 
         //j=minc 

         if(minc<=maxc){

         for(int i =maxr ;i>=minr;i--){
            ans.add(arr[i][minc]);
         }

         minc++;
         }



        }


        return ans ;


        
    }
}