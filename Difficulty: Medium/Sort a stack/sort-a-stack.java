/*Complete the function below*/
class GfG {
    
    public static void insert(Stack<Integer> s ,int x){
        
        if(s.isEmpty() || x>=s.peek()){
            
            s.push(x);
            
        }else{
            int top=s.peek();
            s.pop();
            
            
            insert(s,x);
            s.push(top);
        }
        
        
        
    }
    
    public static  void  function(Stack<Integer> s ){
        
        //it just empry the stack util last and store eeach elemment at each level in function 
        
        if(s.isEmpty())  return ;
        
        int top=s.peek();
        s.pop();
        
        
        function(s);
        
        insert(s,top);
        
       
        
      
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        
        // Stack<Integer> ans= new Stack<>();
      function(s);
      
      return s;
    }
}