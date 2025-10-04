/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    
    public static class  Pair {
        
        Node  node;
        int col;
        
        Pair(Node  node,int col){
            this.node=node;
            this.col=col;
        }
        
        
    }
    public ArrayList<Integer>  bottomView(Node root) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        Deque <Pair>  queue = new ArrayDeque<>();
        
        TreeMap<Integer,Integer>  map = new TreeMap<>();
        
        queue.add( new Pair(root,0));
        while(!queue.isEmpty()){
            
            
            int size= queue.size();
            
            for(int i =0;i<size;i++){
                
              Pair current = queue.poll();
              
              //operation on current node 
              
               // here just add the cola nd its values and at the end the last vealue will be replced with the bottom
                  map.put(current.col,current.node.data);
              
              
              if(current.node.left!=null)  queue.add( new Pair(current.node.left,current.col-1));
              
              if(current.node.right!=null)  queue.add( new Pair(current.node.right,current.col+1));
              
              
            }
        }
        
        
        
        for(Integer num :map.values()){
            
            
            ans.add(num);
            
            
        }
        
        return ans ;
    }
}