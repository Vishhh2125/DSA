class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean [] visited= new boolean[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
          boolean [] ans ={false};
        //cretae adj list 
        
        for(int i=0;i<edges.length;i++){
            
            int u=edges[i][0];
            int v =edges[i][1];
            
            adj.get(u).add(v);
           adj.get(v).add(u);
           
        }
        
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
            dfs(i,-1,adj,visited,ans);
                
            }
            if(ans[0]==true)  break ;
        }
        
        return ans[0];
        
    }
    
    
    void dfs(int vertex,int parent,ArrayList<ArrayList<Integer>> adj,boolean [] visited,boolean[]ans){
        if(ans[0]==true) return ; //base base 
        visited[vertex]=true;
        
        for(int nbr :adj.get(vertex)){
            
            if(!visited[nbr]){
                dfs(nbr,vertex,adj,visited,ans);
            }else{
                //meabs nbr is visited 
                if(nbr!=parent){
                    //nbr not equal to parent means there is loop 
                    ans[0]=true;
                    
                }
            }
        }
    }
}