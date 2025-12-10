class StockSpanner {

      Deque<Pair> st;
       int index;
    public class Pair{
        int val ;
        int index;

       public  Pair(int val,int index){
            this.val=val;
            this.index=index;
        }


    }




    public StockSpanner() {

        this.st= new ArrayDeque<>();
        st.push( new Pair(Integer.MAX_VALUE,0));
        this.index=1;
        
    }
    
    public int next(int price) {


        while( price>=st.peek().val){
            st.pop();
        }


        int ans= index-st.peek().index;

        st.push(new Pair(price,index));
        index++;

        return ans ;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */