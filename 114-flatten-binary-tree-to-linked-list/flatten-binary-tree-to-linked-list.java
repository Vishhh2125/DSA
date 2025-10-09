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
    public static void solution(TreeNode root){
        if(root==null) return ;


        //check for left if not present just ignore and continue 

        if(root.left!=null){
            //if left present 
            TreeNode current=root.left;
            //go to roots.lefts right most part 
            while(current.right!=null){
                current=current.right;

            }
            current.right=root.right;  //give root.left right most to teh the roots right 
            root.right=root.left;  
            root.left=null;
            
        }

        solution(root.right);
    }
    public void flatten(TreeNode root) {
        solution(root);
        
    }
}