class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            
          int [][]   dist = new int [n][n];

           for(int i =0;i<n;i++){
            
            Arrays.fill(dist[i],Integer.MAX_VALUE);
            dist[i][i]=0;

           }
          for(int i=0;i<edges.length;i++){

            int u =edges[i][0];
            int v=edges[i][1];
            int w =edges[i][2];
           
         dist[u][v] = w;
        dist[v][u] = w;
          }

           


           

            for(int via =0;via<n;via++){

                for(int i =0;i<n;i++){
                    for(int j =0;j<n;j++){

                    if(dist[i][via] ==Integer.MAX_VALUE  || dist [via][j]==Integer.MAX_VALUE)  continue;

                    dist[i][j]=Math.min(dist[i][via]+dist[via][j],dist[i][j]);

                    }
                }
            }



            int ans =-1;
            int min =n;

            for(int i =0;i<n;i++){

                int count =0;

                for(int j=0;j<n;j++){

                    if(dist[i][j]<=distanceThreshold){
                        count++;
                    }
                }

                if(count<=min){
                    min=count;
                    ans=i;
                }
            }


            return ans ;



    }
}