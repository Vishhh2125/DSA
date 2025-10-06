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


    public static void dfs(TreeNode current,HashMap<TreeNode,TreeNode> map){
        if(current==null)  return ;


          if(current.left!=null){
            map.put(current.left,current);
          }
          if(current.right!=null){
         map.put(current.right,current);
          }

          dfs(current.left,map);
          dfs(current.right,map);



    }

    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {


        Queue<TreeNode> q= new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        HashMap<TreeNode,TreeNode> map= new HashMap<>();
        Set<TreeNode> set = new HashSet<>();

        dfs(root,map); // add all the nodes parent 


        q.add(target);
         int level=0;
        
        while(!q.isEmpty()){

            int size=q.size();

            for(int i=0;i<size;i++){
                 TreeNode current=q.poll(); //this si curreny node 
                  set.add(current); // this node iws visted
                if(level==k){
                    ans.add(current.val);

                }


                if(current.left!=null && !set.contains(current.left))  q.add(current.left); //add left
                if(current.right!=null && !set.contains(current.right)) q.add(current.right);// add right 
                if(map.containsKey(current) && !set.contains(map.get(current)))  q.add(map.get(current));  //add parent 





            }

            

            level++;


        }

        return ans ;


        
    }
}