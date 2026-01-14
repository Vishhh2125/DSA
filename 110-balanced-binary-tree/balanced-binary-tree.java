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
   public class Pair{
    boolean flag;
    int height;

    Pair(boolean f ,int h){
        this.flag=f;
        this.height=h;
    }
   }
    public Pair solution(TreeNode root){

        if(root==null) return new Pair(true,0);

         Pair left = solution(root.left);
         Pair right =solution(root.right);

         int diff = Math.abs(left.height-right.height);

         boolean flag =true;
         int height = 1+Math.max(left.height,right.height);
         flag = left.flag && right.flag && diff<=1;
          
         return new Pair(flag,height);
    }
    public boolean isBalanced(TreeNode root) {

    Pair ans = solution(root);

    return ans.flag ;
        
    }
}