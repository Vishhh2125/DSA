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

    int postIndex=0;

    public TreeNode helper(int[] inorder, int[] postorder,int i,int j ){

        if(i>j) return null;

       int  root_num=postorder[postIndex--];
        TreeNode root= new TreeNode(root_num);

        int k=i;

        for(;k<=j;k++){
            if(inorder[k]==root_num)break;

        }

        root.right=helper(inorder,postorder,k+1,j); //first call right bcz the next postorder index num is in rigth side of inorder root  not in left side of root
        root.left=helper(inorder,postorder,i,k-1);

        return root;



    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex=postorder.length-1;

        return helper(inorder,postorder,0,inorder.length-1);



        
    }
}