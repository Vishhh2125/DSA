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
    public List<Integer> rightSideView(TreeNode root) {

        if(root==null) return new ArrayList<>();

       TreeMap<Integer,Integer> map  = new TreeMap<>();

       Deque<TreeNode> q= new ArrayDeque<>();
        
        q.add(root);
        int level =0;

       while(!q.isEmpty()){

        int size=q.size();


        for(int i=0;i<size;i++){
            TreeNode current =q.poll();
            map.put(level,current.val);

            if(current.left!=null) q.offer(current.left);
            if(current.right!=null) q.offer(current.right);
        }

         level++;
       }

         List<Integer> ans = new ArrayList<>(map.values());
       return ans ;
        
    }
}