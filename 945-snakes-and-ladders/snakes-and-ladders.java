class Solution {
    public int snakesAndLadders(int[][] board) {

       int m =board.length;

       int vertices = m*m;

    //contruct the graph adj list 

    ArrayList<ArrayList<Integer>>  adj = new ArrayList<>();


    for(int i =1;i<=vertices;i++){
        adj.add(new ArrayList<>());
    }

     HashMap<Integer,Integer>  map = new HashMap<>();
       boolean flag=true;
       int count=1;

       //1]create teh mapping of snakes and ladder from which count 
    for(int i =m-1;i>=0;i--){


        if(flag){

            //from left to roght 
             for(int j=0;j<m;j++){
             if(board[i][j]!=-1){
                map.put(count,board[i][j]);
             }
              count++;
            }
            flag=!flag;
        }else{
            for(int j=m-1;j>=0;j--){
                if(board[i][j]!=-1){
                 map.put(count,board[i][j]);
                }
                count++;
            }
            flag=!flag;
        }
    }

    //2]creating the gaprh from 1 to n* n 

    for(int vertex=1;vertex<=m*m;vertex++){

        for(int i=1;i<=6;i++){
            int nbr=vertex+i;
            if(nbr<=m*m){
            adj.get(vertex).add(nbr);
            }
        }
    }
     //3]bfs traversal 
    //now do bf trversal using adj,visited of M*M  for vertex array and Queue

     boolean [] visited= new boolean [(m*m)+1];
     //as this zero based is not there 
     Deque<Integer> q= new ArrayDeque<>();

    //start form 1 
        q.offer(1);
        visited[1]=true;
       int level=0;
    
         boolean found=false;
       while(!q.isEmpty()){

        int size=q.size();

        for(int i=0;i<size;i++){

            int vertex=q.poll();

             //got to all nbr 

             for(int nbr :adj.get(vertex)){
                if(map.containsKey(nbr)){
                    nbr=map.get(nbr);
                }
                if(!visited[nbr]){
                    if(nbr==m*m){
                        found=true;      
                    }  
                    visited[nbr]=true;
                    q.offer(nbr);
                }
             }

             if(found)  break;
        }
             level++;
             if(found)break;
       }

      if(!found)  return -1;

      return level ;
        
    }
}