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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null)  return true;

      Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.add(root.left);
        q2.add(root.right);



        while(!q1.isEmpty()  && !q2.isEmpty()){

            int size = q1.size();


            for(int i=0;i<size;i++){
                  TreeNode current1=q1.poll();
                  TreeNode current2=q2.poll();

            if(current1==null && current2==null)  continue; // no need to add thir lef right which do not exist 
             if(current1==null || current2==null)  return false;
            if(current1.val!=current2.val)  return false;

             q1.add(current1.left);
             q1.add(current1.right);
            //
            q2.add(current2.right);
             q2.add(current2.left);

            }

          

        }

        return true;




        
    }
}