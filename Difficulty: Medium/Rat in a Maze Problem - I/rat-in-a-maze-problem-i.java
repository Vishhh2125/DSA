class Solution {
    // Function to find all possible paths
    
    
    public static void solution(int[][]maze,int i,int j ,StringBuilder output ,ArrayList<String> ans){
        int n = maze.length;
        if(i==n-1 && j==n-1 ){
            
            ans.add(output.toString());
            return ;
        }
        
         maze[i][j]=0; //backtrack the maze by putting is not visted 
         
         
         
         //down 
          if(i+1<n  && maze[i+1][j]==1){
            output.append('D');
            solution(maze,i+1,j,output,ans);
            output.deleteCharAt(output.length()-1);//backtrack the ans 
        }
          //for left 
        
         if( j-1>=0 && maze[i][j-1]==1){
            output.append('L');
            solution(maze,i,j-1,output,ans);
             output.deleteCharAt(output.length()-1);//backtrack the ans 
        }
        //for right 
        
        if(j+1<n && maze[i][j+1]==1){
            output.append('R');//append ans 
            
            
            solution(maze,i,j+1,output,ans);//call function 
            output.deleteCharAt(output.length()-1);//backtrack the ans 
        }
      
        
        
        //for up 
          if(i-1>=0  &&  maze[i-1][j]==1){
            output.append('U');
            solution(maze,i-1,j,output,ans);
            output.deleteCharAt(output.length()-1);//backtrack the ans 
        }
        
                    maze[i][j]=1; //marked as bloclked

        
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        //in lexographical D<R<L<R alpha betical order or asci 
        
        ArrayList<String>  ans = new ArrayList<>();
        
        if(maze[0][0]==1){
            
        solution(maze,0,0,new StringBuilder(""),ans);
        }
        
        
      
        
        return ans ;
        
    }
}