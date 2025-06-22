// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        
        //condition for if the first node isthe tearget 
        
        while(head.data==x ){
            
            head=head.next;
            if(head!=null){//this condition is to see wetaher the head.next iss null or not 
                
                head.prev=null;
            }
        }
        Node current=head;
        
        
        while(current!=null){
            if(current.data==x){
                if(current.prev!=null){
                 current.prev.next=current.next;

                    
                }
                
                if(current.next!=null){
                    current.next.prev=current.prev;

                }
                
            }
            
            current=current.next;
        }
        
        
        return head;
    }
}