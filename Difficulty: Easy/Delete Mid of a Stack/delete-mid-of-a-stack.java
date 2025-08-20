class Solution {
    // Function to delete middle element of a stack.
    
    public static void   function(Stack<Integer> s ,int n,int current ){
        
        if(n/2==current){
            s.pop();
            return ;
        }
        
        
        
        int top=s.pop();
        
        function(s,n,++current);
        
        s.push(top);
        
        
    }
    public void deleteMid(Stack<Integer> s) {
        
        
        // code here
        
        int n =s.size();
        
        function(s,n,0);
        
    }
}