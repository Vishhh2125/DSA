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

    public TreeNode solution(TreeNode current,TreeNode p  ,TreeNode q){
        if(current==null)  return null;

       TreeNode left=null;
       TreeNode right=null;
       
        if(p.val<=current.val && q.val>=current.val  || p.val>=current.val && q.val<=current.val)     return current;
            //if one is greater and one is smaller tehn the root then means it is the ancesistor  
        else if (p.val<current.val && q.val<current.val){
            //bpth are smaller then the current move left 

        left= solution(current.left,q,p);
        }else {
             right=solution(current.right,p,q);
        }

       if(left==null )  return right;
       else if(right==null)  return left  ;
        else return current;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return solution(root,p,q);
        
    }
}