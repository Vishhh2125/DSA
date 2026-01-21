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
    public int countNodes(TreeNode root) {

        if(root==null) return 0;

        int lvl=0;

        int last_size=0;

        Deque<TreeNode> q= new ArrayDeque<>();
        

        q.offer(root);

        while(!q.isEmpty()){

            int size= q.size();
            last_size=size;


            for(int i=0;i<size;i++){

                TreeNode current =q.poll();

                if(current.left!=null){
                  q.offer(current.left);
                }

                if(current.right!=null){
                  q.offer(current.right);
                }
            }
            lvl++;
        }

        int  h=lvl-1; //height 
        h=h-1; //decrease by one dont count last level we have its alst node nodes count 

        int ans = (int)Math.pow(2,h+1)-1 +last_size;

        return ans ;


        
    }
}