/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    public static Node reverse (Node head){
         Node pre=null;
        Node current=head;
        
        while(current!=null){
            Node post=current.next;
            current.next=pre;
            pre=current;
            current=post;
        }
        
     return pre;
        
    }
    public Node addOne(Node head) {
         //steps :-
        // reversse the lsit 
        //add and checkk carry and then pass to other node 
        //reverse back 
          
          
          head=reverse(head);
          
          Node current=head;
          int carry =1;
          Node pre=null;
          
          while(current!=null){
              
             int data = current.data;
             
             data=data+carry;
             
             if(data/10==0){
                 carry=0;
             }else{
                 carry=1;
                 data=data%10;
             }
             current.data=data;
             pre=current;
              current=current.next ;
              
              
              
              
          }
          
          if(carry!=0){
              pre.next=new Node(carry);
              
          }
          
          return  reverse(head);
        
       
        
        
        
        
    }
}