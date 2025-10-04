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

     public static class Pair{

        TreeNode node ;

       int row;


       Pair(TreeNode node ,int row){
        this.node=node;
        this.row=row;
       }

        
     }
    public List<Integer> rightSideView(TreeNode root) {

    

        List<Integer> ans = new ArrayList<>();

        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        Deque<Pair>  q = new ArrayDeque<>();

        if(root==null)  return ans ;


        q.add( new Pair(root,0));


        while(!q.isEmpty()){
         

         int size = q.size();

         for(int i=0;i<size;i++){

             Pair current = q.poll();


            //current node execution 
            

            map.put(current.row,current.node.val);

            if(current.node.left!=null)  q.add(new Pair(current.node.left,current.row+1));
             if(current.node.right!=null)  q.add( new Pair(current.node.right,current.row+1));


         }

           
        }

        for(Integer ans_num : map.values()){

            ans.add(ans_num);
        }

        return ans ;






         
        
    }
}