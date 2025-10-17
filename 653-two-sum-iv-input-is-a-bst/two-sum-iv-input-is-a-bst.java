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
    public boolean findTarget(TreeNode root, int k) {

        ArrayList<Integer> arr = new ArrayList<>();
       Stack<TreeNode> st = new Stack<>();

        TreeNode current=root;
        while( current!=null || !st.isEmpty()){

            while(current!=null){
                st.push(current);
                current=current.left;    //left

            }

            TreeNode node = st.pop();

            arr.add(node.val);   //root

            current=node.right;   //right 
        }
        

    int i=0;
    int j=arr.size()-1;

    while(i<j){
        if(arr.get(i)+arr.get(j)==k)  return true;
        else if(arr.get(i)+arr.get(j)<k){
            //need bigger sum 
            //increase i 
            i++;
        }else{
            j--;
        }

    }

    return false;
    }
}