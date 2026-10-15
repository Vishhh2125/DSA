class Solution {
    int [][] memo;
    int[][] matrix;
     int m ;
     int n ;
     int [] rows={0,+1,+1};
     int [] cols={+1,+1,0};
    public int solution(int i ,int j ){
        if(i>=m || j>=n)  return 0; //invalid condition

        if(matrix[i][j]==0) return 0 ; //base case 

        if(memo[i][j]!=-1)  {
            return memo[i][j]; //caching 
        }
          int min =Integer.MAX_VALUE;
          //get teh minimum of all position 
         for(int k=0;k<rows.length;k++){
           min=Math.min(min,solution(i+rows[k],j+cols[k]));
           
         }
        

         return memo[i][j]=1+min; // return for the previous reurive call 


    }
    public int countSquares(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        int ans=0;
        this.matrix=matrix;
        memo = new int [m][n];
        for(int i =0;i<m;i++){
            Arrays.fill(memo[i],-1);
        }

        // funtion 
         for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){

       ans+= solution(i,j);
            }
         }

        return ans ;
     
        
    }
}