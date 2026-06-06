class Solution {


    public boolean dfs(int u ,int [][] adj ,boolean [] visited,boolean [] pathVisited){


        visited[u]=true ;
        pathVisited[u] = true;


        for(int nbr : adj[u]){
            
             if(pathVisited[nbr]==true)   return true ;
            else if(visited[nbr]==false && dfs(nbr,adj,visited,pathVisited)==true)  return true ; 

        }
        pathVisited[u]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
     
      

      int n =graph.length;

      List<Integer>  ans = new ArrayList<>();
      for(int i =0;i<n;i++){

        boolean [] visited= new boolean [n];
        boolean [] pathVisited=new boolean [n];

        if(!dfs(i,graph,visited,pathVisited)){
            ans.add(i);
        }


      }


      return ans ;
    

        
    }
}