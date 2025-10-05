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
    public static class Pair {
        TreeNode node;
        int i;

        Pair(TreeNode node ,int i ){
            this.node= node;
            this.i=i;

        }


    }
    public int widthOfBinaryTree(TreeNode root) {

        
        Queue<Pair>  queue = new LinkedList<>();
         int max=0;
        queue.add(new Pair(root,1));

        while(!queue.isEmpty()){
            int size= queue.size();
            

            int first_index= queue.peek().i;
             int  last_index= 0;
            for(int i=0;i<size;i++){

                Pair current=queue.poll();
                 last_index=current.i;


                 //insert eh future child and tehre index 
                if(current.node.left!=null){
                     //so the index for right child is 2*i
                    queue.add(new Pair (current.node.left, 2 * current.i));
                }

                if(current.node.right!=null){
                    //so the index for right child is 2*i+1
                    queue.add(new Pair (current.node.right,(2 * current.i)+1));
                }

            }

            //now we will get the last index which will be the last node in that level 

            int  width= last_index-first_index+1;
            max=Math.max(max,width);

            

            
        }


        return max;



    }
}