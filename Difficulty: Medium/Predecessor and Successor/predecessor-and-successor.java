/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    
    // ceil and floor  que 
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        
        ArrayList<Node> ans = new ArrayList<>();
        
        Node floor=null;
        Node ceil=null;
        
        Node current=root;
        
        //predecessor / floor
        
         while(current!=null){
            
            if(current.data<key){
                
                //can be a answer 
                floor=current;
                //move left 
                current=current.right;
                
                
                
            }else if(current.data==key){
                //move left 
                current=current.left;
                
            }
            else{
                current=current.left ;
                
            }
        }
        
        current=root;
        while(current!=null){
            
            if(current.data<key){
                
               
                //move right 
                current=current.right;
                
                
                
            }else if(current.data==key){
                //move right
                current=current.right;
                
            }
            else{
                //can be answer and also move left we can fidn more close answer to key 
                ceil=current;
                current=current.left ;
                
            }
        }
        
        
       ans.add(floor);
       ans.add(ceil);
       return ans;
        
    }
}