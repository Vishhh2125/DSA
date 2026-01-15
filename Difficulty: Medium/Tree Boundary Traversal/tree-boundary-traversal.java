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
    
    
    void left_boundary(Node current ,ArrayList<Integer> ans ){
     if(current==null) return ;

        if(current.left==null && current.right==null)  return ; //bcz leaf we only eed left boundaryb
        
        
        if(current.left!=null){
            ans.add(current.data);
            left_boundary(current.left,ans);
        }else if(current.right!=null){
            ans.add(current.data);
            left_boundary(current.right,ans);
        }
        
        
    }
    
    
    void leaf (Node current ,ArrayList<Integer>ans){
        
        if(current==null) return ;
         
         
         //similar to preorder 
        if(current.left==null && current.right==null){
            ans.add(current.data);
        }else{
            
        leaf(current.left,ans);
        leaf(current.right,ans);
        
        }
    }
    
    void right_boundary(Node current,ArrayList<Integer> ans ){
        
        if(current==null) return ;
        
        if(current.left==null && current.right==null) return ;
        
        
        if(current.right!=null){
            right_boundary(current.right,ans);
            
        }else if(current.left!=null){
            right_boundary(current.left,ans);
        }
        
        
          ans.add(current.data); //comes in reverse order;
    }
    
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        if(root==null) return new ArrayList<>();
        ArrayList<Integer>  ans = new ArrayList<>();
        
        if(root.left==null && root.right==null){
            ans.add(root.data);
            return ans ;
            //only one root node 
        }
        
         ans.add(root.data); //add root first 
        left_boundary(root.left,ans);
        leaf(root,ans);
        right_boundary(root.right,ans);
        
        return ans ;
        
        
    }
}