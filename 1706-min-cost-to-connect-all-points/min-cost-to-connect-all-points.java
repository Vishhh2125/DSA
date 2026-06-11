class Solution {

    public int distance (int [] x ,int [] y){

        return Math.abs(x[0]-y[0])+Math.abs(x[1]-y[1]);
    }

    
    public int minCostConnectPoints(int[][] points) {

      int V =points.length;

      boolean [] visited=new boolean  [V];
      PriorityQueue<int []>  pq= new PriorityQueue<>((a,b)->a[1]-b[1]);

      int mstcost=0;
      pq.add(new int []{0,0});

      while(!pq.isEmpty()){


        int [] arr= pq.poll();

        int u =arr[0];
        int wt =arr[1];

        if(visited[u]==true)  continue;
         visited[u]=true ;
        mstcost+=wt;

        for(int i =0;i<V;i++){

            if(visited[i]==true)  continue;

            int dis=distance(points[u],points[i]);

            pq.add(new int []{i,dis});

        }

       

      }



       return mstcost; 
    }
}