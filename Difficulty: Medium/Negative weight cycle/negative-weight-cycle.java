// User function Template for Java

class Solution {
    public int isNegativeWeightCycle(int n, int[][] edges) {
        // code here
        
        
        int [] dist = new int [n];
        
        Arrays.fill(dist,0);
        dist[0]=0; //lets consider 0 as src and weight as 0
        
        for(int j=0;j<n-1;j++){
            
            for(int i=0;i<edges.length;i++){
                int u =edges[i][0];
                int v=edges[i][1];
                int weight=edges[i][2];
                
                
                // if(dist[u]==Integer.MAX_VALUE) continue;
                 
                 //relaxation 
                int new_weight = dist[u]+weight;
                
                if(new_weight<dist[v]){
                    
                    dist[v]=new_weight;
                }
                
            }
        }
        
        
        for(int i=0;i<edges.length;i++){
            int u =edges[i][0];
                int v=edges[i][1];
                int weight=edges[i][2];
                
                
                if(dist[u]==Integer.MAX_VALUE) continue;
                 
                 //relaxation 
                int new_weight = dist[u]+weight;
                
                if(new_weight<dist[v]){
                    
                    return 1;  //negative weight cycle stopped 
                }
            
        }
        
        return 0;
    }
}