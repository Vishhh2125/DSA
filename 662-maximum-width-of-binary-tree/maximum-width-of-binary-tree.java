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
    public class Pair{
        TreeNode node;
        int index;


        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {

        int max=0;

        Queue<Pair> q= new LinkedList<>();

        q.offer(new Pair(root,1));

        while(!q.isEmpty()){

            int size=q.size();

             int first_index=q.peek().index;
             int last_index=q.peek().index;;
            for(int i=0;i<size;i++){
                Pair current=q.poll();
                 last_index=current.index;
                

                 if(current.node.left!=null) q.offer(new Pair(current.node.left,2*current.index)); 
                 if(current.node.right!=null) q.offer(new Pair(current.node.right,2*current.index+1));

                


             }


             max=Math.max(max,last_index-first_index+1);
        }


        return max;
        
    }
}