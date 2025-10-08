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

    public int postindex;  // it tellls which is teh root in inorder range given 

    public TreeNode construct(int start ,int end ,int[] inorder,int []postorder){
        if(start>end)  return null ;
        //build node 

        TreeNode root = new TreeNode(postorder[postindex]);
        postindex--;
          int inindex=start;
        while(inindex<=end){

            if(inorder[inindex]==root.val) break; //this is the current root index in inorder we want 
            inindex++;
        }

        root.right=construct(inindex+1,end,inorder,postorder);
        root.left= construct(start,inindex-1,inorder,postorder);


        return root;
        

       

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postindex=postorder.length-1;
        return construct(0,inorder.length-1,inorder,postorder);
        
    }
}