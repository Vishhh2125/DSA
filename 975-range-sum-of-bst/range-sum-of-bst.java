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

    int sum=0;

    public void helper(TreeNode current ,int low,int high ){

        if(current==null) return ;


        if(current.val>=low && current.val<=high){
            //
            sum+=current.val;
            //expore its all node 
            helper(current.left ,low,high);
            helper(current.right,low,high);

        }else if(current.val<low){
            //go for big value on right 
            helper(current.right,low,high);

        }else{
            helper(current.left ,low,high);
        }

    }
    public int rangeSumBST(TreeNode root, int low, int high) {

        helper(root,low,high);
        return sum;

        
    }
}