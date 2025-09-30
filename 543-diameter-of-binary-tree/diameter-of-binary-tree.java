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

     public static  int height(TreeNode current){

        if(current==null)  return 0;


        return 1+Math.max(height(current.left),height(current.right));
    }

    public static int solution(TreeNode current,int max){

        if(current==null)  return max;


        int path = height(current.left) + height(current.right);

        int max1= solution(current.left,Math.max(max,path));

        int max2= solution(current.right,Math.max(max,path));

        return Math.max(max1,max2);


    }
    public int diameterOfBinaryTree(TreeNode root) {

        return solution(root,0);




        
    }
}