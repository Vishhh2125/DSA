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
    
    public class Pair{
         Node node;
         int col;
         
         Pair(Node n , int c ){
             this.node=n;
             this.col=c;
         }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
          Deque<Pair> q= new ArrayDeque<>();
        
        q.offer(new Pair(root,0));
        
        
        while(!q.isEmpty()){
            
            Pair current =q.poll();
            
            Node node =current.node;
            int col=current.col;
            
            //add to map only if the col dont have any value in map 
            
            if(!map.containsKey(col)){
                map.put(col,node.data);
            }
            
            if(node.left!=null)     q.offer(new Pair(node.left,col-1));
            if(node.right!=null)   q.offer(new Pair(node.right,col+1));
            
            
             
            
            
        }
        
        ArrayList<Integer> ans= new ArrayList<>(map.values());
        
        
        return ans ;
        
        
        
        
    }
}