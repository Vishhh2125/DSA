/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public static int findMax(Node root) {
        // code here
        
        if(root==null) return Integer.MIN_VALUE;
         int current=root.data; //consider it as max 
        int left= findMax(root.left);
        int right=findMax(root.right);
        
        //commpare with left 
        current=Math.max(left,current);
        // compare with right 
        current=Math.max(right,current);
        
        return current;
        
        
        
    }

    public static int findMin(Node root) {
        
        // code here
        
        if(root==null)  return Integer.MAX_VALUE;  //if null mean the max value so that it can be replced by any other value as smallest
        
        
        int current=root.data;
        
        int left =findMin(root.left);
        int right=findMin(root.right);
        
        
        current=Math.min(current,left);
        current=Math.min(current,right);
        
        return current ;
    }
}