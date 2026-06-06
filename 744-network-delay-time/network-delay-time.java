class Solution {

    public void dijkstra( ArrayList<ArrayList<int[]>>  adj, int [] ans ,PriorityQueue<int []>  q,int src){

        ans[src]=0;

        q.offer(new int []{src,0});


        while(!q.isEmpty()){

            int [] arr =  q.poll();
            int u =arr[0];
            int w=arr[1];


            if(w>ans[u])  continue;


            for(int [] nbr :adj.get(u)){

                int new_weight=w+nbr[1];

                if(new_weight<ans[nbr[0]]){
                    //we got another low weight path 

                    ans[nbr[0]]=new_weight;

                    q.offer(new int []{nbr[0],new_weight});
                }
            }
        }


        
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        

        ArrayList<ArrayList<int[]>>  adj = new ArrayList<>();

        for(int i =0;i<=n;i++){
            adj.add(new ArrayList<>());
        }


        for(int i =0;i<times.length;i++){

            int u =times[i][0];
            int v =times[i][1];
            int w =times[i][2];

            adj.get(u).add(new int []{v,w});

        }

        int [] ans = new int [n+1];
       PriorityQueue<int []>  q= new PriorityQueue<>((a,b)->{
            return a[1]-b[1];
        });
         Arrays.fill(ans, Integer.MAX_VALUE);
         
       dijkstra(adj,ans,q,k);




       int max=0;

       for(int i =1;i<ans.length;i++){
        int num =ans[i];
        if(num==Integer.MAX_VALUE) return -1 ;


        max=Math.max(max,num);
       }



       return max;

       //bfs traversal 

     

    }
}