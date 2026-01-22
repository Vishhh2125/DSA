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

    int preIndex=0;
     public TreeNode helper(int[] preorder, int[] inorder,int i,int j){
        if(i>j)  return null;
        

        int root_num=preorder[preIndex++];
        

        TreeNode root=new TreeNode(root_num);
         int k=i;
        for(;k<=j;k++){
            if(inorder[k]==root_num) break;

            
        }

        root.left=helper(preorder,inorder,i,k-1);
        root.right=helper(preorder,inorder,k+1,j);

        return root;

     }
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        return helper(preorder,inorder,0,inorder.length-1);

        
        
    }
}