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
class BSTIterator {

    Stack<TreeNode> st ; 

    public BSTIterator(TreeNode root) {

        st=new Stack<>();
        //go the mowst left and make stack ready for the first inorder node 
        TreeNode current= root;


        while(current!=null){
           
            st.push(current);  //root
            current=current.left;
        }


        
    }
    
    public int next() {

        TreeNode current= st.pop();
        TreeNode iterator=current.right;

        while(iterator!=null ){

        st.push(iterator) ;   //root
        iterator= iterator.left;

        // why right root left beacuse it is stck it will give back left-- root --right for inorder 
        

        }


      return current.val;        
    }
    
    public boolean hasNext() {

        if(st.isEmpty())  return false;
        else return true;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */