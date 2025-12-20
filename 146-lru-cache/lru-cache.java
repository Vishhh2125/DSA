class LRUCache {

       Node head;
       Node tail;
       int capacity;
       int size;
     HashMap<Integer,Node> map;


    class Node {
        int val;
        int key ;
        Node next;
        Node pre;


        Node(int key,int val){
            this.key=key;
            this.val=val;
            this.next=null;
            this.pre=null;
        }
    }

    public LRUCache(int capacity) {

        this.capacity=capacity;
        head= new Node(0,0);
        tail=new Node(0,0);
        head.next = tail;
         tail.pre = head;
        map= new HashMap<>();
        size=0;

        
    }


    public void addToHead(Node node ){

        Node  head_next=head.next;
         node.pre=head;
         node.next=head.next;
         head.next=node;
         head_next.pre=node;


    }
    
    public int get(int key) {

        if(map.containsKey(key)){
            Node node =map.get(key);
            //remove from the position 
            node.pre.next=node.next;
            node.next.pre=node.pre;
            node.next=null;
            node.pre=null;

            addToHead(node);
            return node.val;
        }else return -1;
            
        
    }
    
    public void put(int key, int value) {

       if(map.containsKey(key)){

        //remove and add to teh head 

         Node node = map.get(key);
         node.pre.next=node.next;
         node.next.pre=node.pre;
         node.pre=null;
         node.next=null;
        node.val=value; //update teh value 
        
         //add to head 
        addToHead(node); //add to head
       }else{
         
        if(size==capacity){
            //remove form tail 

            Node node = tail.pre;
            node.pre.next=node.next;
            node.next.pre=node.pre;
            node.pre=null;
            node.next=null;
            map.remove(node.key);
            size--;

        }

        Node node = new Node(key,value);
        map.put(key,node);
         addToHead(node); //add to head 
       
         size++;


       }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */