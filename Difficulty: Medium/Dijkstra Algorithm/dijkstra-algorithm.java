class Solution {
    
        class Pair {
        int vertex;
        int weight;
        
        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public int[] dijkstra(int V, int[][] edges, int src) {
        
        
        // code here
        
        //creta adj 
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
       
       for(int i=0;i<V;i++){
           adj.add(new ArrayList<>());
           
       }
       
       
       for(int i=0;i<edges.length;i++){
           
           int u=edges[i][0];
           int v = edges[i][1];
           int weight=edges[i][2];
           
           adj.get(u).add(new Pair(v,weight));
           adj.get(v).add(new Pair(u,weight));
           
       }
       
       
       //lest start th ediretra alfgo 
       
       //priorityqueu 
       //ans array 
       
       int [] ans = new int [V];
       Arrays.fill(ans, Integer.MAX_VALUE); //all other vertexx and infinte 
       ans[src]=0; //shorted distance for sorce is zerof rom start 

        PriorityQueue<Pair> pq = new PriorityQueue<>(
        (a, b) -> a.weight - b.weight
    );
    
    //insert teh src
    pq.offer(new Pair(src, 0));

    

     while(!pq.isEmpty()){
         
         Pair vertex= pq.poll();
         int weight= vertex.weight;
         
        if(weight > ans[vertex.vertex]) continue;   // 🔥 replaces visited[]

        
         //go to all nbr 
         for(Pair nbr :adj.get(vertex.vertex)){
             
             int nextweight=weight+nbr.weight;
             
             if(nextweight <ans[nbr.vertex]){
                 //the next weoght path is smaller than te alredy exisiting weight in ans 
                 ans[nbr.vertex]=nextweight;
             pq.offer(new Pair(nbr.vertex,nextweight));
                 
             }
             
             
         }
     }
    
      return ans ;  
    }
}