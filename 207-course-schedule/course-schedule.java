class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //topological sort and cyclle detection

        Deque<Integer> q= new ArrayDeque<>();

        int [] indegree= new int [numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());

        }

        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v =prerequisites[i][1];
            adj.get(u).add(v);
            indegree[v]++;
        }

        //adj and indgree si created 

        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);

            }
        }
        //q has beeen prepared 

        while(!q.isEmpty()){

            int vertex=q.poll();
            //perfrom any action needed 

            for(int nbr :adj.get(vertex)){
                //remove all dependency of indegree on each nbr for current vertex 

                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.offer(nbr);
                    //so this cource is ready as all prereq is finished 

                }
            }
        }

        for(int i :indegree){

            if(i!=0) return false;
            //there is depedency which cannot be resolce due to loop dependecy 
        }

        return true ;
        
    }
}