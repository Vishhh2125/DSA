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
    

    public  int preindex =0;

    public  TreeNode construct(int start ,int end,int[] preorder ,int[] inorder){

        if(  start>end)  return null;  

        TreeNode current= new TreeNode(preorder[preindex]); //cretae new node now created it left and right 
        preindex++;

         int root_index=start;
        while(root_index<=end){

            if(inorder[root_index]==current.val){
               
               break;
            }

            root_index++;
        }



        current.left= construct(start,root_index-1,preorder,inorder);
        
        current.right= construct(root_index+1,end,preorder,inorder);

        


        return current;

        


    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        return construct(0,inorder.length-1,preorder,inorder);


        
    }
}