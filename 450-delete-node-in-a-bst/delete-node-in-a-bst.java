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
    
    public TreeNode deleteNode(TreeNode root, int val) {

        if(root==null) return null;

        TreeNode current= root;
         TreeNode parent =null;
        while(current!=null){
             if(current.val==val)  break;
             else if(val<current.val){
                //go left 
                parent=current;
                current=current.left;

            }else{
                parent=current;
                 current=current.right;

            }
        } 


        if(current==null)  return root; // no such node found 

        //for leaf node 


        if(current.left==null && current.right==null){

            if(parent==null){
                //root node only 

                root=null;
            }else if(parent.left==current){
                parent.left=null;

            }else{
                parent.right=null;
            }
           
            
        }else if(current.left==null || current.right==null){
            
            if(parent==null){
                //root node with one child at current 
               if(current.left!=null){
                root=current.left;
               }else{
                root=current.right;
              }
            } else if(parent.left==current){
                //parents left have currrent 

                if(current.left!=null){
                    parent.left=current.left;
                }else{
                    parent.left=current.right;

                }
            }else{
                //parent right have current 
                if(current.left!=null){

                    parent.right=current.left;

                }else{

                    parent.right=current.right;
                }
            }

        }else if (current.left!=null && current.right!=null){

            TreeNode node = current.right;
             TreeNode prev_node = current;

            while(node.left!=null){
                prev_node=node;
                node=node.left;
            }
            //we go inorder successor 
            //swap elemnt 
            int temp = current.val;
            current.val=node.val;
            node.val=temp;

          //now delete or detach the inorder succseor carring the target 

          if(prev_node.left==node){
            prev_node.left=node.right;
          }else{
            prev_node.right=node.right;   

            // why node.right ?  beacuse teh inorder ssucessor can have rooght node so dont give null give it node.right it can add null or tha node
          }

         
        }

    
      return root;

        
    }
}