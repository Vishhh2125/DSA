class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        
        boolean [] visited= new boolean[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<V;i++){
            
            adj.add(new ArrayList<>());
            
        }
        
        
        
        for(int i=0;i<edges.length;i++){
            
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            
        }
        
        
        
        for(int i=0;i<V;i++){
            
            ArrayList<Integer> ans = new ArrayList<>();
            if(!visited[i]){
            dfs(i,visited,adj,ans);
                
            }
            
            if(ans.size()>0){
                
                result.add(ans);
                
            }
        }
        
        
        return result;
        
        
    }
    
    
    
    public void dfs(int node ,boolean []visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ans){
        
        
        
        visited[node]=true;
        ans.add(node);
        
        
        for(int nbr :adj.get(node)){
            
            if(!visited[nbr]){
                
                dfs(nbr,visited,adj,ans);
            }
        }
    }
}