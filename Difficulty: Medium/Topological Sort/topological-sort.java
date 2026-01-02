class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        
        Deque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int [] indegree= new int [V];
        
        ArrayList<ArrayList<Integer> > adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        
        for(int i=0;i<edges.length;i++){
             int u =edges[i][0];
             int v=edges[i][1];
            adj.get(u).add(v);
            
            indegree[v]++;  //cretae indegree everytime for v 
        }
        
      for(int i = 0; i < V; i++){
    if(indegree[i] == 0){
        q.offer(i);   
    }
}
        
        
        while(!q.isEmpty()){
            
            int vertex=q.poll();
            //perform any action 
            ans.add(vertex);
            
            for(int nbr : adj.get(vertex)){
                
                //remove indegree fo every nbr of vertex as it is vertex is traversed 
                indegree[nbr]--;
                
                if(indegree[nbr]==0){
                    q.offer(nbr);
                    //if nbr indegree is zero it is ready for trevserse
                }
            }
        }
        
        return ans ;
        
    }
}