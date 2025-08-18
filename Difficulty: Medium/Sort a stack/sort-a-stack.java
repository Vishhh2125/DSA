/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        Stack<Integer>  ans = new Stack<>();    
        
        
        while(!s.isEmpty()){
            
            
            int top= s.peek();
            s.pop();
            
            
            if(ans.isEmpty()){
                ans.push(top);
            }else{
                
                
                while(!ans.isEmpty() && top<ans.peek()){
                    
                    s.push(ans.peek());
                    ans.pop();
                }
                
                ans.push(top);
            }
        }
        
        return ans;
    }
}