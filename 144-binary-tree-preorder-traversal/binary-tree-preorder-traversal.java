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

    public static void solution(TreeNode current ,List<Integer> ans){

        if(current==null){
            return ;

        }


        ans.add(current.val);
        solution(current.left,ans);
        solution(current.right,ans);

    }
    public List<Integer> preorderTraversal(TreeNode root) {


        List<Integer> ans = new ArrayList<>();


        solution(root,ans);

        return ans ;


        
    }
}