class MyLinkedList {


    private Node head;
    


    public MyLinkedList(){

        head=null;

    }

    private class Node {
        public int val ;
        public Node next ;



       public  Node (int val){
            this.val=val;
            this.next=null;

        }

    }

    
    
    public int get(int index) {

        int count=0;

        Node current =head;


        while(current!=null){
            if(count==index)  return current.val;

            current=current.next;
            count++;
        }

        return -1;

        
    }
    
    public void addAtHead(int val) {

        if(head==null){
            head=new Node (val);
            return ;
        }


        Node newNode= new Node(val);

        newNode.next=head;
        head=newNode;



        
        
    }
    
    public void addAtTail(int val) {

          if(head==null){
            addAtHead(val);
            return ;

          }


          Node current=head;

          while(current.next!=null){
            current=current.next;

          }

          current.next= new Node(val);
        
    }
    
    public void addAtIndex(int index, int val) {

        if( index==0 ){
            addAtHead(val);
            return ;

        }
        

        int count=0;

        Node current=head;
         Node pre =null;

        while(current!=null){

            if(count==index)  break;
            pre=current;
            current=current.next;
            count++;

        }


        if(index>count)  return ;   //index out of bound 

        Node newNode = new Node(val);

        pre.next=newNode;
        newNode.next=current;


        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null)  return ;
        if(index==0){

            if(head.next==null){
                head=null;
            }else{

            head=head.next;
            
            }

            return ;
        }

        Node current=head;
          int  count=0;
          Node pre =null;

        while(current!=null){

            if(count==index) break;

            pre=current;
            current=current.next;
            count++;

        }


        if(current==null)  return ;

       


        pre.next=current.next;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */