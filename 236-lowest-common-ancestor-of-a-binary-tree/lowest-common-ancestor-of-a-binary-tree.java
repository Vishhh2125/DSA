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
    public TreeNode solution(TreeNode current,TreeNode p ,TreeNode q){

        if(current==null)  return null;
        if(current==q || current==p)  return current;


        TreeNode left= solution(current.left,p,q);
        TreeNode right= solution(current.right,p,q);

        if(left==null && right==null)  return null;

        else if(left!=null  && right!=null)  return current;

        else if(left!=null && right==null)  return left;
        else return right ;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return solution(root,p,q);
        
    }
}