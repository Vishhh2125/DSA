class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        
        ArrayList<Integer> ans = new  ArrayList<>();
        boolean [] visited = new boolean [adj.size()];
        
        Deque<Integer> st = new ArrayDeque<>();
        
        st.push(0);
        
        
        
        while(!st.isEmpty()){
            
            int node =st.pop();
            if(!visited[node]){
                 
              visited[node]=true;
              ans.add(node);
            
                    for(int i=adj.get(node).size()-1;i>=0;i--){
                        
                        int  nbr=adj.get(node).get(i);
                        
                        if(!visited[nbr]){
                            
                            
                            st.push(nbr);
                            
                        }
                    }
            }
        }
        
        
      return ans;  
        
    }
}