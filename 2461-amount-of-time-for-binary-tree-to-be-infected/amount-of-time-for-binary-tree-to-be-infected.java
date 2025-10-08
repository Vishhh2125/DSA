/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void  dfs(TreeNode current,HashMap<TreeNode,TreeNode> map,TreeNode [] start_node ,int start  ){
        if(current==null)  return ;
         

         if(current.val==start){
            start_node[0]=current;
         }
        if(current.left!=null){

            map.put(current.left,current);

        }

        if(current.right!=null){

            map.put(current.right,current);
            
        }


        dfs(current.left,map,start_node,start);
        dfs(current.right,map,start_node,start);

        
    }

   
    public int amountOfTime(TreeNode root, int start) {

        HashMap<TreeNode,TreeNode> map = new HashMap<>();
         TreeNode [] start_node = new  TreeNode[1];
         Set<TreeNode> visited= new HashSet<>();
        dfs(root,map,start_node,start); // we got every nodes parent 
         
        Queue<TreeNode> q= new LinkedList<>();

        q.add(start_node[0]);
        visited.add(start_node[0]);
         int time =-1;
        while(!q.isEmpty()){

            int size=q.size();
            
            for(int i=0;i<size;i++){

            TreeNode current=q.poll();

            if(current.left!=null && !visited.contains(current.left)) {
                q.add(current.left);
                visited.add(current.left);
            }
            if(current.right!=null && !visited.contains(current.right)){

            q.add(current.right);
            visited.add(current.right);
            } 
            if( map.containsKey(current) && !visited.contains(map.get(current)) ){
                //because map does contains root as it does not have roots parent so it willl give null 

                q.add(map.get(current));
                visited.add(map.get(current));


            }


            }
            time++;

            
        }


        return time;

        
    }
}