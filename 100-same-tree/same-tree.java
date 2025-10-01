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

    public static boolean solution(TreeNode current1,TreeNode current2){
        if(current1==null && current2==null)  return true ; //both are null
        else if(current1==null || current2==null)   return false;
        else if(current1.val!=current2.val)  return false;  //two values are not teu justg return false 
        else{
          //both values right move to next node checkf rom left and right 
          return solution(current1.left,current2.left)  && solution(current1.right,current2.right);
        }
        
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return solution(p,q);
        
    }
}