/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode current, TreeNode p, TreeNode q) {

        if(current==null) return null;


        TreeNode left =lowestCommonAncestor(current.left,p,q);
        TreeNode right=lowestCommonAncestor(current.right,p,q);


        if(current==p || current==q) return current; //latest lca ;
        else if(left==null && right==null) return null;
        else if(left!=null && right!=null) return current;
        else if(left==null && right!=null) return right;
         else return left;

        
    }
}