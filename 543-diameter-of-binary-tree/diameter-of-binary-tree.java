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
       public int max=0;
    public int height(TreeNode root){

        if(root==null) return 0;

            int left =height(root.left);
            int right = height(root.right);

            int path =left+right;
            max=Math.max(path,max);

      return  1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {

        int height= height(root);

        return max;
        
    }
}