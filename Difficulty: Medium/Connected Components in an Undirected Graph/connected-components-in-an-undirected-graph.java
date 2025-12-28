class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        
        int n = edges.length;
        
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            
            list.add(new ArrayList<>());
        }
        
        
        
        for(int i=0;i<edges.length;i++){
            
            list.get(edges[i][0]).add(edges[i][1]);
             list.get(edges[i][1]).add(edges[i][0]);
            
        }
        
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        
        for(int i=0;i<V;i++){
            
            if(!visited[i]){
                // teh starting node is not visited lest star te dfs from here e
                
                 
                   ArrayList<Integer> ans = new ArrayList<>();
                    Deque<Integer>  q = new ArrayDeque<>();
                    q.offer(i);
                    visited[i]=true;
                    
     
                    while(!q.isEmpty() ){
                        
                        
                        int start=q.poll();
                        ans.add(start);
                        
                        
                        for(Integer node :list.get(start)){
                            
                            if(!visited[node]){
                                visited[node]=true;
                                q.offer(node);
                                
                            }
                            
                        }
                        
                        
                        
                        
                    }
                    
                 result.add(ans);   
              
             
            }
             
            
        }
        
        
        return result ;
    }
}