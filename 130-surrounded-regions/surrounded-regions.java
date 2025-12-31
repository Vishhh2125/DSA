class Solution {
    public void solve(char[][] board) {

        int m =board.length;
        int n = board[0].length;
        boolean [][]visited= new boolean[m][n];

         
         //dfs trversal for column nad row and fins any  0 just mark all ist cnnected 0 as just visited no modification there 
          //first col
         for(int i=0;i<m;i++){
            if(board[i][0]=='O' && visited[i][0]==false){
                //it shoudleb in teh edge and non visited 
                dfsEdge(i,0,board,visited);
            }
         }
        //  last col
         for(int i=0;i<m;i++){
            if(board[i][n-1]=='O' && visited[i][n-1]==false){
                //it shoudleb in teh edge and non visited 
                dfsEdge(i,n-1,board,visited);
            }
         }

         //first row 
          for(int i=0;i<n;i++){
            if(board[0][i]=='O' && visited[0][i]==false){
                //it shoudleb in teh edge and non visited 
                dfsEdge(0,i,board,visited);
            }
         }
         //last row 

         for(int i=0;i<n;i++){
            if(board[m-1][i]=='O' && visited[m-1][i]==false){
                //it shoudleb in teh edge and non visited 
                dfsEdge(m-1,i,board,visited);
            }
         }

         //now edges having boundary are visited and not marked as X 
         //so not fnd all teh 0 and mark it x by dfs 


         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(board[i][j]=='O'  && visited[i][j]==false){

                    dfs(i,j,board,visited);
                }
            }
         }


        
        
    }



    public void dfsEdge(int i,int j,char[][] board, boolean [][]visited){


        visited[i][j]=true;

        //check all for direction 
        int cols[]={-1,0,1,0};
        int rows[]={0,-1,0,1};


        for(int k=0;k<cols.length;k++){
            int row = i + rows[k];
            int col = j + cols[k];
            if(col>=0 && col<board[0].length && row>=0 && row<board.length &&
             board[row][col]=='O' && visited[row][col]==false){
                //it should be woth in the matrix contraint and the ceel should be zero and nonvisited
                dfsEdge(row,col,board,visited); 

            }

        }
    }
   public void dfs(int i,int j,char[][] board, boolean [][]visited){


        visited[i][j]=true; //mark visited 
        board[i][j]='X' ;//chaneg value from 0 to x 
        //check all for direction 
        int[] cols={-1,0,1,0};
        int [] rows={0,-1,0,1};


        for(int k=0;k<cols.length;k++){
           int row = i + rows[k];
            int col = j + cols[k];
            if(col>=0 && col<board[0].length && row>=0 && row<board.length &&
             board[row][col]=='O' && visited[row][col]==false){
                //it should be with in the matrix contraint and the ceel should be zero and nonvisited
                dfs(row,col,board,visited); 

            }

        }
    }
}