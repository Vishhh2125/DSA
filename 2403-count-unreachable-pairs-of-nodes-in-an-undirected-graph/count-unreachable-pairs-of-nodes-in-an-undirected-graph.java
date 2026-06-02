class Solution {


     int [] parent ;
     int [] rank ;

    public int find (int u ){

        if(parent[u]==u)  return u ;


        return parent[u]= find(parent[u]);


    }


    public void union (int x,int y ){

        int x_root=find(x);
        int y_root=find(y);


        if(x_root==y_root)  return ;


        if(rank[x_root]>rank[y_root]){
            parent[y_root]=x_root;

        }else if ( rank[y_root]>rank[x_root]){
            parent[y_root]=x_root;
        }else{

         parent[y_root]=x_root;
         rank[x_root]++;


        }
    }
    public long countPairs(int n, int[][] edges) {

      parent = new int [n];
      rank= new int [n];
      for(int i =0;i<n;i++){

        parent[i]=i;

      }
     

       for(int i =0;i<edges.length;i++){
             int u=edges[i][0];
             int v=edges[i][1];

             int root_u=find(u);
             int root_v=find(v);

             
                union(u,v);
             

        
       }

       //dijoint set completed // now teh gropus are formed 


       HashMap<Integer,Integer>  map = new HashMap<>();


     for(int i = 0; i < n; i++) {
    int root = find(i); //fins te parent 
    //never do parent[i]  direcly calling wil nnot insure the root prenta s path compression will only happen due to find 
    map.put(root, map.getOrDefault(root, 0) + 1);
}


       long remaining = (long)n ;

        long ans=0;
       for(int key :map.keySet()){

        long size= (long)map.get(key);

        ans+= (long )size * (remaining -size);

        remaining -=size;



       }
      


      return ans ;




        
    }
}