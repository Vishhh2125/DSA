class Solution {

    public class Pair{
        int i;
        int j;
        int weight;


        Pair(int i,int j ,int weight){
            this.i=i;
            this.j=j;
            this.weight=weight;

        }


    }
    public int minimumEffortPath(int[][] heights) {

        int m=heights.length;
        int n =heights[0].length;



        //make ans 2d array were we will store teh storest path 

        int [][] ans = new int [m][n];

           int [] cols={-1,0,1,0};
           int [] rows={0,-1,0,1};

         PriorityQueue<Pair> pq = new PriorityQueue<>(
        (a, b) -> a.weight - b.weight
        );
          
          for (int i = 0; i <m; i++) {
           Arrays.fill(ans[i], Integer.MAX_VALUE);
          }

         //fill first valueb 
           ans[0][0]=0;//start wil ahve zero weight/height 
         pq.offer(new Pair(0,0,0)); //lest push teh first eleement with weight zero 
           

           while(!pq.isEmpty()){

            Pair vertex=pq.poll();
            
            int current_weight=vertex.weight;

            if(current_weight>ans[vertex.i][vertex.j]) continue;


            for(int k=0;k<cols.length;k++){

                int col= vertex.j+cols[k];
                int row=vertex.i+rows[k];

            if(col<0 || row<0 || col>=n || row>=m ) continue;

             int nbr_weight = Math.abs(heights[vertex.i][vertex.j] - heights[row][col]);
                int new_weight = Math.max(current_weight,nbr_weight);


                if( new_weight<ans[row][col]){
                    ans[row][col]=new_weight;
                    pq.offer(new Pair(row,col,new_weight));

                }

            }




           }
     


     return ans[m-1][n-1];
         

        
    }
}