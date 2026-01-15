// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int max=100000000;
        int []  dist = new int [V];
        Arrays.fill(dist,max);
        dist[src]=0;  //src initilise
      
    //   perform relaxtuon v-1 times by cycle 
    
    
    
    for(int j=0;j<V-1;j++){
        
        
        for(int i=0;i<edges.length;i++){
            
            int u=edges[i][0];
            int  v =edges[i][1];
            int weight=edges[i][2];
            
            int current =dist[u];
            
            if(current==max)  continue; //no need to clacukqate it woukd be max if we do it 
            
            int new_dist=current+weight;
            
            if(new_dist<dist[v]){
                
                dist[v]=new_dist;
                
            }
            
        }
    }
    
    
    //to check negatuve wooegth cycle 
    for(int i=0;i<edges.length;i++){
            
            int u=edges[i][0];
            int  v =edges[i][1];
            int weight=edges[i][2];
            
            int current =dist[u];
            
            if(current==max)  continue; //no need to clacukqate it woukd be max if we do it 
            
            int new_dist=current+weight;
            
            if(new_dist<dist[v]){
                
                return new int [] {-1};  //negative wieght cycle detected
                
            }
            
            
        }
    
            return dist;
    
    }
}
