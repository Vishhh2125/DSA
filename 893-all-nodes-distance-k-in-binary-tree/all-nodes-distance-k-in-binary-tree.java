/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        
        Deque<TreeNode> q= new ArrayDeque<>();
        
        Set<TreeNode> set = new HashSet<>();

         
        q.offer(root);
       

       //store hashmap with mapping parent 
        while(!q.isEmpty()){

            TreeNode current = q.poll();
            

            if(current.left!=null){

                map.put(current.left,current);
                q.offer(current.left);
            }

             if(current.right!=null){

                map.put(current.right,current);
                q.offer(current.right);
            }
        }


        //now 
        q.clear();

        q.offer(target); 
         set.add(target); //mark visited   
        int count=0;
        while(!q.isEmpty() && count<k){

            int size=q.size();
           
        
            for(int i=0;i<size;i++){
                  TreeNode current = q.poll();

                  if(current.left!=null && !set.contains(current.left)){
                     q.offer(current.left);
                     set.add(current.left);
                  }
                   if(current.right!=null && !set.contains(current.right)) 
                   { 
                    q.offer(current.right);
                    set.add(current.right);
                   }
                   //also add parent if there 
                   if(map.containsKey(current) && !set.contains(map.get(current))){
                    q.offer(map.get(current));
                    set.add(map.get(current));
                   }

            }
            count++;



        }

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
     

     return ans ;

        
    }
}