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


          List<List<Integer>> result = new ArrayList<>();

        Deque<TreeNode> q= new ArrayDeque<>();
         
         boolean flag =true;
           q.offer(root);
         while(!q.isEmpty()){

            int size= q.size();
            List<Integer> ans = new ArrayList<>();

            for(int i=0;i<size;i++){

                TreeNode current = q.poll();
                ans.add(current.val);
                if(current.left!=null)  q.offer(current.left);
                if(current.right!=null) q.offer(current.right);
            }


            if(flag==false){
                //reverse
                Collections.reverse(ans);
                
            }

            result.add(ans);
            flag=!flag;


           


         }

         return result ;
        
    }
}