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

    public int helper(TreeNode current){

        if(current==null) return Integer.MAX_VALUE;
      if(current.left==null && current.right==null) return 1;


      return 1+Math.min(helper(current.left ),helper(current.right));


    }
    public int minDepth(TreeNode root) {
      
      if(root==null)  return 0;

      return helper(root);
      


        
    }
}