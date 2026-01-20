/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    
    public boolean solution(Node current){
        if(current==null) return true;
        
        //if leaf node just it is leaf so valid anyway 
        if(current.left==null && current.right==null){
            return true;
            // leaf node means it is valid ;
        }
        
        
        int left= (current.left!=null ? current.left.data :0);
        int right =(current.right!=null ? current.right.data :0);
        
        Boolean isflag= (left+right==current.data);
        
        return isflag && solution(current.left)&& solution(current.right);
    }
    public boolean isSumProperty(Node root) {
        //  code here
        
        return solution(root);
        
    }
}