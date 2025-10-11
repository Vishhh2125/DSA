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

    public void solution(TreeNode root ,int k,int [] ans){
        if(root==null)  return ;

        solution(root.left,k,ans );
   
         ans[0]--;
        if(ans[0]==0){

            ans[1]=root.val;
            return ;
        }
        solution(root.right,k,ans);
        
    }
    public int kthSmallest(TreeNode root, int k) {

        int [] ans = new int[2];
        ans[0]=k;  // to assign teh counter globally 

        solution(root,k,ans);

        return ans[1];
        
    }
}