class Solution {
    int [][][]  memo ;
    int m ;
    int n ;
    int [][] grid;
    
    public int solution(int row ,int c1 ,int c2 ){
        if(c1>=n || c1<0)  return 0;
        if(c2>=n || c2<0)  return 0;
        if(row>=m)  return 0 ;
        

        if(memo[row][c1][c2]!=-1)  return memo[row][c1][c2];

        int curr = 0;

        curr+=grid[row][c1];
        if(c1!=c2){
            curr+=grid[row][c2];
        }


         int  max=0;
        for(int i =-1;i<=1;i++){
            for(int j =-1;j<=1;j++){
           
           max=Math.max(max,solution(row+1,c1+i,c2+j));
            }
        }

        return memo[row][c1][c2]= max+curr;

    }
    public int cherryPickup(int[][] grid) {
        this.grid=grid;
        this.m=grid.length;
        this.n=grid[0].length;

        memo= new int [m][n][n];

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(memo[i][j],-1);
            }
        }
        //memo[row][c1][c2]
        // c1 column number of 1st robort 
        //c2 columsn is number of 2nd robort 


        return solution(0,0,n-1);

    }
}