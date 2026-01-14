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

    public boolean solution(TreeNode root1,TreeNode root2){

        if(root1 ==null && root2==null)  return true; //base case  //until end the brach is same 
        if(root1==null || root2==null)  return false ; //one of tehb nrach is over but stil ther i remaining means noot identical

        //real core funtionality 

        if(root1.val!=root2.val)return false;
        else{ 
            //until noe rigth search for depth 

          return solution(root1.left ,root2.left) &&   solution(root1.right,root2.right) ;

          //OTHER METHOD WHIHC IS SAME AS ABOVE 
        // boolean left = solution(root1.left ,root2.left) ;
        //   if(left){
        //     solution(root1.right,root2.right)
        // }



         
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return solution(p,q);
        
    }
}