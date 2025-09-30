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

    public static  int solution(TreeNode current){

        if(current==null)  return 0;


        return 1+Math.max(solution(current.left),solution(current.right));
    }
    public int maxDepth(TreeNode root) {

        return solution(root);
        
    }
}