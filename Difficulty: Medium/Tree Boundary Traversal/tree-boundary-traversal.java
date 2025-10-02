/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
   public static  void left_boundary(Node current,ArrayList<Integer> ans){
        
        if(current==null)  return ;
        
          if (current.left != null) {
            ans.add(current.data); // not leaf
            left_boundary(current.left, ans);
        } else if (current.right != null) {
            ans.add(current.data); // not leaf
            left_boundary(current.right, ans);
        }
    }
    
    
     public static void right_boundary(Node current,ArrayList<Integer> ans){
         if(current==null)  return ;
         
         
        
         
                        if (current.right != null) {
                    right_boundary(current.right, ans);
                    ans.add(current.data);  // add after recursion for reverse order
                } else if (current.left != null) {
                    right_boundary(current.left, ans);
                    ans.add(current.data);
                }

        
         
         
     }
     
     
     public static void leaf(Node current,ArrayList<Integer> ans ){
         
         if(current==null)  return ;
         
         
         if(current.right==null && current.left==null){
             
             ans.add(current.data);
             //this is leaf node 
          
             
             
         }
         
         leaf(current.left,ans);
         leaf(current.right,ans);
         
         
     }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        if(root==null)  return ans;
        
        if(root.right!=null || root.left!=null){
            
         ans.add(root.data); //add root it is not leaft  
        }
        
        
        left_boundary(root.left,ans); //left  boundary 
        leaf(root,ans);
        right_boundary(root.right,ans);//right boundary 
        
        
        
        return ans;
        
    }
}