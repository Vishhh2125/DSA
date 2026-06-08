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
    public TreeNode createBinaryTree(int[][] arr) {


        HashMap<Integer,TreeNode> map = new HashMap<>();
        HashMap<Integer,Boolean> isroot = new HashMap<>();



        for(int i =0;i<arr.length;i++){

            int parent = arr[i][0];
            int child=arr[i][1];

            if(!map.containsKey(parent)){

                map.put(parent,new TreeNode(parent));
                isroot.put(parent,true );

            }

            if(!map.containsKey(child)){
                map.put(child,new TreeNode(child));
                isroot.put(child,true );
            }
        }




        //consturct tree 

      for(int i =0;i<arr.length;i++){
         int parent = arr[i][0];
            int child=arr[i][1];
            
            int isleft=arr[i][2];
            isroot.put(child,false);

            if(isleft==1){

                map.get(parent).left=map.get(child);
            }else{

                map.get(parent).right=map.get(child);
                
            }
      
      }


      TreeNode root=null;

      for(int key : isroot.keySet()){

        if(isroot.get(key)==true ){
            root=map.get(key);
            break ;
        }
      }


      return root;


      

        
    }
}