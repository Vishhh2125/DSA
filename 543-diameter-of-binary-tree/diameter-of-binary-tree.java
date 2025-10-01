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
     //so basically solution wil retyurn the height ans diameter max at the current node 
    public static int[] solution(TreeNode current){


        if(current==null)  return new int[]{0,0};

        int [] left= solution(current.left);
        int [] right= solution(current.right);

        int [] ans = new int [2];
         //intiliase height
        ans[0]=1+Math.max(left[0],right[0]);

        // diamater is left+right height 

        int diameter=left[0]+right[0];

        ans[1]= Math.max(diameter,Math.max(left[1],right[1]));

        return ans;

        
    }
    public int diameterOfBinaryTree(TreeNode root) {

        int [] ans = solution(root);

        return ans[1];
        
    }
}