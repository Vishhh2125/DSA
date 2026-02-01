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

        int diff=Integer.MAX_VALUE;
        int prev=-1;
        public void helper(TreeNode current ){

            if(current==null) return ;

            helper(current.left);
            //current operation 
            if(prev!=-1){
                diff= Math.min(Math.abs(prev-current.val),diff);
            }
            prev=current.val;
             
             helper(current.right);

        }
    public int getMinimumDifference(TreeNode root) {

        helper(root);

        return diff;


        
    }
}