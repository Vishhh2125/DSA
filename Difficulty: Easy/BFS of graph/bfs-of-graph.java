class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
         
         boolean []visited = new boolean [adj.size()];
         
         
         ArrayList<Integer> ans = new ArrayList<>();
         Deque<Integer> q = new ArrayDeque<>();
          
          q.offer(0);
          visited[0]=true;
          //startc from 0th node 
         while(!q.isEmpty()){
             
             
             int node = q.poll();
             ans.add(node);//added to bfs 
              //got to ist all neigboring and ass to queue for bfs 
             for(int nbr :adj.get(node)){
                 
                 if(!visited[nbr]){
                     
                     visited[nbr]=true;
                     q.offer(nbr);
                 }
             }
             
             
             
         }
         
         return ans ;
    }
}