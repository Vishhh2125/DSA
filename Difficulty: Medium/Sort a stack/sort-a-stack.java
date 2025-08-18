/*Complete the function below*/
class GfG {
    
    public static  Stack<Integer> function(Stack<Integer> s ,Stack<Integer> ans){
        
        
        if(s.isEmpty())  return ans;
        
        
        int top =s.peek();
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
        
        return function(s,ans);
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        
        Stack<Integer> ans= new Stack<>();
        return function(s,ans);
    }
}