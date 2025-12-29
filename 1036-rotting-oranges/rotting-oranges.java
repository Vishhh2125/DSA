class Solution {

    public class Pair{

        int i;
        int j;

        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }


    }
    public int orangesRotting(int[][] grid) {


        int [] cols={-1,0,1,0};
        int [] rows={0,-1,0,1};
         int fresh=0;
         Deque<Pair> q= new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }


            }
        }  //add all initilise roten roanges 

          int ans=0;
        while(!q.isEmpty()){
             int size=q.size();
             
             boolean changed=false;

            for(int j=0;j<size;j++){
            
                Pair current =q.poll();
                
                for(int i=0;i<cols.length;i++){
                    
                    int row= current.i+rows[i];
                    int col=current.j+cols[i];
                   

                    if(row<grid.length && row>=0 && col<grid[0].length && col>=0 && grid[row][col]==1){
                         changed=true;
                        grid[row][col]=2; //make teh orange rotten 
                        fresh--;
                        q.offer(new Pair(row,col));
                    }

                }
            }

              if (changed) ans++;  // increase only when a minute really passes

        }
      

     if(fresh>0){
        return -1;
     }

     return ans ;
        
    }
}