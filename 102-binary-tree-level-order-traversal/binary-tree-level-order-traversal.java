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

    
    public List<List<Integer>> levelOrder(TreeNode root) {


        if(root==null) return new ArrayList<>();

             Queue<TreeNode> queue  = new ArrayDeque<>();

             List<List<Integer>> ans = new ArrayList<>();
              
                
                

                queue.add(root);



              while(!queue.isEmpty()){

                List<Integer> temp_ans=new ArrayList<>();
                int size= queue.size();

          
                for(int i =0;i<size;i++){

                    TreeNode current=queue.poll();

                    temp_ans.add(current.val);

                    if(current.left!=null){
                        queue.add(current.left);

                    }

                    if(current.right!=null){

                        queue.add(current.right);

                    }
                }

                ans.add(temp_ans);

                
                






              }

              return ans ;
                    
    }
}