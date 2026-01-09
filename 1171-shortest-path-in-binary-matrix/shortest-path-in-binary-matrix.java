class Solution {

    public class Pair{

        int i ;
        int j ;

        Pair(int i ,int j ){
            this.i=i;
            this.j=j;
        }


    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int n= grid.length;
        boolean[][] visited = new boolean [n][n];
        Deque<Pair> q= new ArrayDeque<>();

        int[] cols={-1,-1,0,1,1,1,0,-1};
        int [] rows={0,-1,-1,-1,0,1,1,1};


        if(grid[0][0]==0){
        //add only if the first eleemnet is 0 
        q.offer(new Pair(0,0));
        visited[0][0]=true;
        }
          int level=1;
          boolean flag =false;

        while(!q.isEmpty()){

            int size=q.size();

            for(int i=0;i<size;i++){

                Pair vertex=q.poll();

                //go to all grid neighbours
                for(int k=0;k<cols.length;k++){

                    int col=vertex.j+cols[k];
                    int row=vertex.i+rows[k];
                    

                    if(row>=0 && row<n && col>=0 && col<n && grid[row][col]==0 && !visited[row][col]){
                        //read to go 
                        visited[row][col]=true;

                        q.offer(new Pair(row,col));
                        if(row==n-1 && col==n-1){

                            flag=true;
                            break;

                        }

                    }
                }

                if(flag) break ;

            }

            level++;
            if(flag) break ;
        }



        if(n==1 && grid[0][0]==0)  return 1; // for just one elemenet and teh one lemenet is 0 
        if(!flag) return -1;

        return level ; 
        
    }
}