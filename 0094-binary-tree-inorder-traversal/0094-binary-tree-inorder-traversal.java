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
    public List<Integer> inorderTraversal(TreeNode root) {


        Deque<TreeNode>  st = new ArrayDeque<>();
         List<Integer> ans = new ArrayList<>();
       if(root==null) return ans ;
        TreeNode current =root;

        while(!st.isEmpty() || current !=null){

            while(current!=null){
                st.push(current );
                current =current.left ;
            }

            current =st.pop();
            ans.add(current.val);
            
            current =current.right ;
        }


        return ans ;
        
    }
}