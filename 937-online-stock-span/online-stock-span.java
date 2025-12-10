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
         //imp :->add max to always have the largest at end whihc will give ans in indexing the days 
        this.index=0;
        
    }
    
    public int next(int price) {


        while(!st.isEmpty() &&  price>=st.peek().val){
            st.pop();
        }
        

          
        int ans= 0;
        if(!st.isEmpty()){

            int last_big_price=st.peek().index;

            ans=index-last_big_price;

        }else{
            //it si empty means teher si no bug last price so teh index should be out of array beginning which is -1
           int last_big_price=-1;
            ans=index-last_big_price;

        }

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