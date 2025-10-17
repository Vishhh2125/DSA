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

    public boolean find_pair( TreeNode root,int k ,int num1 ){

        boolean ans= false;
        TreeNode current =root;
        while(current!=null){
            if( current.val!=num1 && current.val+num1==k ){
                ans=true;
                break;
            }
            else if (k-num1<current.val) current=current.left;
            else current=current.right;
        }

        return ans ;


    
    }

    public boolean solution(TreeNode root,TreeNode current,int k ){
        if(current==null)  return false;

        boolean left = solution(root,current.left,k);

        boolean curr= find_pair(root,k,current.val);

        boolean right=solution(root,current.right,k);

        return left || curr || right ;

    }
    public boolean findTarget(TreeNode root, int k) {

        return solution(root,root,k);

        
        
    }
}