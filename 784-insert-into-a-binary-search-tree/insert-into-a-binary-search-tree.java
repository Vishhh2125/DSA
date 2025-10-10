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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);

        TreeNode current= root;
        TreeNode prev= null;
        while(current!=null){


            if(current.val<val){
                //move right 
                prev=current;
                current=current.right;
            }else{
                prev=current;

                 current=current.left;
            }

        }

        if(prev.val>val){
            //add to left 
            prev.left= new TreeNode(val);


        }else{
            //add to right 
            prev.right= new TreeNode(val);


        }

        return root;
        
    }
}