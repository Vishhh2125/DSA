class Solution {

    public class Pair{
        int i;
        int j;

        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }


    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        
        if(image[sr][sc]==color) return image ;
           int start = image[sr][sc];
        int [] colj={-1,0,+1,0};
        int [] rowi={0,-1,0,+1};

        
        Deque<Pair> q= new ArrayDeque<>();
      
        q.offer(new Pair(sr,sc));
        image[sr][sc]=color; //starting is flooded


        while(!q.isEmpty()){
          

            Pair current = q.poll();

            for(int i =0;i<rowi.length;i++){

                int row= current.i + rowi[i];
                int col=current.j+colj[i];


                if( row>=0 && row<image.length&& col>=0 && col<image[0].length && image[row][col]==start  ){
                    //mean we can flood 
                    image[row][col]=color;
                    q.offer(new Pair(row,col));
                }

            }



        }

        return image;
        
        
    }



}