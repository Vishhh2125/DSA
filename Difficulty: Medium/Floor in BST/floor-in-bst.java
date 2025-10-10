// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        // Code here
        
        
        int ans=Integer.MIN_VALUE ;
        
        
        while(root!=null){
            
            if(root.data==x)  return root.data;
            else if (root.data<x){
                //it is smaller than  the  x so potentail ans theer can be more value close to x 
                
                ans= Math.max(root.data,ans);
                root=root.right;
                
            }else{
                
                root=root.left;
                
            }
          
        }
        
        if(ans==Integer.MIN_VALUE) return -1; // no value is smaller tahn x 
        
        return ans  ;
        
        
        
    }
}