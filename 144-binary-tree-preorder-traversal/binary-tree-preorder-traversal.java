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
    public List<Integer> preorderTraversal(TreeNode root) {

    

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        if(root==null) return ans;

        st.push(root);

        while(!st.isEmpty()){

            TreeNode current = st.pop();

             ans.add(current.val);  
 
             if(current.right!=null) st.push(current.right); //pushing right to get left first 
             if(current.left!=null) st.push(current.left);  //push left to get right after left 
        }

        return ans ;
        
    }
}