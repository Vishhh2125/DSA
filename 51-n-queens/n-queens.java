class Solution {

    public static boolean isvalid(int row,int col,boolean [][]board){

        //check for horizontal

        for(int i=0;i<col;i++){

            if(board[row][i]==true){
                return false;
            }

        }
        //check diagonal left  up 

        int i=row-1; 
        int j=col-1;

        while(i>=0 && j>=0){

         if(board[i][j]==true){
            return false;
         }
         i--;
         j--;
        }


        //check right down 

        i=row+1;
        j=col-1;

        while(j>=0 && i<board.length){

            if(board[i][j]==true){
                return false;
            }

            i++;
            j--;
        }

        

      return true;    
     
      
    }

    public static void solution(int col,boolean [][] board ,List<List<String>> ans ){

      if(col==board.length){
        //this is one of teh valid answer
        List<String> result= new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder row= new StringBuilder();
            for(int j=0;j<board.length;j++){

                if(board[i][j]==false){
                  row.append('.');
                }else{
                    row.append('Q');
                }

            }
            result.add(row.toString());


        }

        ans.add(result);


      }

      for(int row =0;row<board.length;row++){

        if(isvalid(row,col,board) ){

            board[row][col]=true;//queen seated 

            solution(col+1,board,ans);//recuse

            board[row][col]=false; //backtrack
        }
      }


     

      



    }
    public List<List<String>> solveNQueens(int n) {

        boolean [][] board = new boolean[n][n];

       List<List<String>> ans= new ArrayList<>();


       solution(0,board,ans);

       return ans;

        
    }
}