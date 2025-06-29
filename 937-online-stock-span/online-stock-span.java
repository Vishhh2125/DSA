class StockSpanner {

    // private int [] input;
    private Stack<int []> st ;
    private int current;

    

    public StockSpanner() {
        this.current=0;
        this.st=new Stack<>();
        
        
    }
    
    public int next(int price) {
       

        while(!st.isEmpty() && st.peek()[0]<=price){

            st.pop();
        }
          int ans;
          int greatest;
        if(st.isEmpty() ){

            //means he is the most grestest element 

            greatest=-1;
          
            
        }else{
          //mean some peek is the greatest
          greatest=st.peek()[1];

          
        }

        st.push(new int[]{price,current});

          ans=current-greatest;

          current++;


          return ans;


        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */