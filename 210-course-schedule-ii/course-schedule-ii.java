class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int [] ans= new int [numCourses];
        int count=0;
        Deque<Integer> q=  new ArrayDeque<>();

        int [] indegree= new int [numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){

            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){

            int u=prerequisites[i][0];
            int v =prerequisites[i][1];

            adj.get(v).add(u);
            indegree[u]++;
        }

        //add all indegree 0 one in queue as start 
        for(int i=0;i<numCourses;i++){

            if(indegree[i]==0){
                q.offer(i);
            }
        }


        while(!q.isEmpty()){

            int vertex= q.poll();
            //add ans 
            ans[count++]=vertex;
            for(int nbr :adj.get(vertex)){

                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.offer(nbr);
                }
            }
        }

        for(int i:indegree){

            if(i!=0) return new int [0];
        }

        return ans ;
    }
}