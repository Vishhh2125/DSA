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

    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {


        if(root==null)  return new ArrayList<>();


        Deque<TreeNode> queue = new ArrayDeque<>();
        
           queue.add(root);

           boolean flag= true; // truue means left to right 

           List<List<Integer>>  ans= new ArrayList<>();

           while(!queue.isEmpty()){
             //size of currrent queue is the elelmnt in that level
             int size= queue.size();

             List<Integer> temp_ans=new ArrayList<>(); // to store level values



            



                        for(int i=0;i<size;i++){


                            TreeNode current= queue.poll();

                            temp_ans.add(current.val);


                            if (current.left != null) {
                            queue.add(current.left);
                            }

                            if (current.right != null) {
                            queue.add(current.right);

                            }


                        }



                if(flag==false){
                    Collections.reverse(temp_ans);
                }


                ans.add(temp_ans);
             

             flag=!flag;

             

           }





      return ans ;
        
    }
}