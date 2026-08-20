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
    public List<Integer> postorderTraversal(TreeNode root) {

        
        Deque<TreeNode>  st = new ArrayDeque<>();
         List<Integer> ans = new ArrayList<>();
       if(root==null) return ans ;
       TreeNode current =root;
        TreeNode last =null;
       while(current!=null || !st.isEmpty()){

                while(current!=null ){
                    st.push(current );
                    current =current.left;

                }

          TreeNode node=st.peek();
            if(node.right!=null && last!=node.right){
            //if right is not empty and its not process at alst time 
                current=node.right;

            }else{
            
                //right is process and just porocess teh current 
                ans.add(node.val);
                last=node;
                st.pop();
            }



       }
       
       
       
    return ans;
    

        
    }
}