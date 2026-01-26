class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {

          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


          for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

          }



          for(int i=0;i<edges.length;i++){
            int u =edges[i][0];
            int v=edges[i][1];


            adj.get(u).add(v);
            adj.get(v).add(u);

        }


        int [] dx= dfs(n,adj,x);
        int [] dy=dfs(n,adj,y);
        int [] dz=dfs(n,adj,z);
        int ans=0;

        for(int  i=0;i<n;i++){

            if (dx[i] == Integer.MAX_VALUE ||
    dy[i] == Integer.MAX_VALUE ||
    dz[i] == Integer.MAX_VALUE) continue;


        long  a=dx[i];
        long  b=dy[i];
         long  c =dz[i];

            a=a*a;
            b=b*b;
            c=c*c;
            if(a==b+c || b==a+c || c==b+a) ans++;

            
            
        }   

        return ans ;     
        
        
    }
    public class Pair{

        int vertex;
        int weight;
        Pair(int vertex,int weight){
            this.vertex=vertex;
            this.weight=weight;
        }



    }
    public int [] dfs(int n ,ArrayList<ArrayList<Integer>> adj,int src){

        int [] dist = new int [n];

        Arrays.fill(dist,Integer.MAX_VALUE);


        Deque<Pair> q= new ArrayDeque<>();

        q.offer(new Pair(src,0));
        dist[src]=0;
       
            while (!q.isEmpty()){
                Pair vertex= q.poll(); 

                if(vertex.weight>dist[vertex.vertex]) continue;


                for(int nbr :adj.get(vertex.vertex)){

                    int new_weight=vertex.weight+1;

                    if(new_weight<dist[nbr]){
                          dist[nbr]=new_weight;
                        q.offer(new Pair(nbr,new_weight));
                    }
                }

             }



        return dist;

    }

}