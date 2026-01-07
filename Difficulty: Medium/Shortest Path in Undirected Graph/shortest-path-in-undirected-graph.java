class Solution {
    
   public  class Pair{
        
        int vertex;
        int weight;
        
        Pair(int v,int w){
            this.vertex=v;
            this.weight=w;
        }
    }
    public int[] shortestPath(int V, int[][] edges, int src) {
        // code here
        
        int [] ans = new int[V];
        boolean [] visited= new boolean[V];
        Deque<Pair> q= new ArrayDeque<>();
        for(int i=0;i<V;i++){
            ans[i]=-1;
            //initilise everthing as -1 for first time
        }
        
        //make adjaceny list 
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int u =edges[i][0];
            int v =edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        //start the trevesal from src and distance and 0 from src 
        q.offer(new Pair(src,0));
        visited[src]=true;
        
        while(!q.isEmpty()){
            
            Pair current = q.poll();
            
            //add answer 
            
            ans[current.vertex]=current.weight;
            
            //go to alla adj and add it to the quuee 
            
            for(int nbr :adj.get(current.vertex)){
                if(!visited[nbr]){
                 visited[nbr]=true;   
                q.offer(new Pair(nbr,current.weight+1));
                }
                //add nbr and weight plus by one 
            }
            
            
            
        }
        
       return ans ; 
        
        
        
        
        
    }
}
