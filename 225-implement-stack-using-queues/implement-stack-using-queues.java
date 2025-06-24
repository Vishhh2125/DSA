class MyStack {

    private Deque<Integer>  main;
    private Deque<Integer>  helper;

    public MyStack() {
        main=new ArrayDeque<>();
        helper=new ArrayDeque<>();

        
    }
    
    public void push(int x) {

        while(!main.isEmpty()){
            helper.addLast(main.removeFirst());
        }

        main.addLast(x);

        while(!helper.isEmpty()){
            main.addLast(helper.removeFirst());
        }
        
    }
    
    public int pop() {

        return main.removeFirst();
        
    }
    
    public int top() {

        return main.getFirst();
        
    }
    
    public boolean empty() {

        return main.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */