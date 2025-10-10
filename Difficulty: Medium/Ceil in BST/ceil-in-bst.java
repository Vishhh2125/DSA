/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    
    public void solution(Node root,int x ,int [] ans){
        
        if(root==null) return ;
        
                if(root.data==x){
                    
                    ans[0]= Math.min(root.data,ans[0]);
                } 
                else if(root.data>x){
                    // this can be possiblen ans 
                    // but ther can be be more answer smaller then this and gretaer tahn x 
                    //move smaller side mean left
                    ans[0]= Math.min(root.data,ans[0]);
                    
                    solution(root.left,x,ans);
                }else{
                    
                    //te current root value is smaller we need bigger tehan x 
                    solution(root.right,x,ans);
                }
    }
    int findCeil(Node root, int x) {
        // code here
        
        int [] ans = new int[1];
        ans[0]=    Integer.MAX_VALUE;  // we ahve to inilise with biggest nt number 
        solution(root,x,ans);
        
        if(ans[0]==Integer.MAX_VALUE)  return -1; //no value is greater than x 
        
        return ans[0];
        
    }
}