class Solution {
    public int swimInWater(int[][] grid) {

        PriorityQueue<int []>  pq= new PriorityQueue<>((a,b)->a[2]-b[2]);

           int cost=0;
           int m =grid.length;
           int n =grid[0].length;

           int [] []dist = new int [m][n];


           for(int i =0;i<m;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);

           }
            
             int [] cols={1,0,-1,0};
             int []rows={0,1,0,-1};
           pq.offer(new int []{0,0,grid[0][0]});
            dist[0][0] = grid[0][0];

           while(!pq.isEmpty()){
            int [] top = pq.poll();

            int i =top[0];
            int j =top[1];
            int wt =top[2];


            if(dist[i][j]<wt)  continue;
            

            for(int k=0;k<rows.length;k++){

                int row =rows[k]+i;
                int col =cols[k]+j;
                
                if(row<0 || col<0 || row>=m ||col>=n)  continue;

                int new_cost=Math.max(wt,grid[row][col]);

                     
                if(new_cost<dist[row][col]){
                        dist[row][col] = new_cost;

                    pq.offer(new int []{row,col,new_cost});
                }

                
            }


           }



           return dist[m-1][n-1];
        
    }
}