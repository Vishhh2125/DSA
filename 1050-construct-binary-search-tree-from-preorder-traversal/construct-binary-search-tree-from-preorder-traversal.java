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
    public TreeNode bstFromPreorder(int[] arr) {

       

        TreeNode root= new TreeNode(arr[0]);
         Stack<TreeNode> st= new Stack<>();
         TreeNode current=root;
         st.push(root);
          int i=1;
         while(i<arr.length){

        

            while(i<arr.length && arr[i]<current.val){
                //then add
                current.left= new TreeNode(arr[i]);
                i++;
                st.push(current);
                current=current.left;
            }

             while (!st.isEmpty() && i < arr.length && arr[i] > st.peek().val) {
                current = st.pop();
            }

            if(i<arr.length){

            //means it is bigger noe lest add to the right 
            
            current.right= new TreeNode(arr[i]);//added to right 
            current=current.right;
            i++;
            }


            


         }
        


      return root;
        
    }
}