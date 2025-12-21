class MinStack {

      Deque<Pair> st ;
      
     
     class Pair{

        int val;
        int min;


        Pair(int val,int min){
            this.val=val;
            this.min=min;
        }
     }

    public MinStack() {



    st= new ArrayDeque<>();
        
    }
    
    public void push(int val) {

       int  min= st.isEmpty() ? val : Math.min(st.peek().min,val);

        st.push(new Pair(val,min));
        
    }
    
    public void pop() {

        st.pop();
        
    }
    
    public int top() {

       return st.peek().val;
        
    }
    
    public int getMin() {


        return st.peek().min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */