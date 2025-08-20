
class Solution {
    
    //1st recursive call :-> to break the element until empty and save each element in each recusive call
    //   2nd recursive call :->to insert the each element at eevery recursive call  element at last 
    static void insert (Stack<Integer> st ,int num){
        if(st.isEmpty()){
            
            st.push(num);
            
            return ;
            
        } ;
        //swap one time 
        int temp=st.pop();
        
        insert (st,num);
        
        st.push(temp);
        

    }
    
    static   void Break(Stack<Integer> st ){
        
        if(st.isEmpty())  return ;
        
        int num=st.pop();
        
        Break(st);
        
        insert(st,num);
        
        
        
            
        
        
    }
    static void reverse(Stack<Integer> st) {
        
        Break(st);
        
        
        
        
        
        
        
        
        
    }
}