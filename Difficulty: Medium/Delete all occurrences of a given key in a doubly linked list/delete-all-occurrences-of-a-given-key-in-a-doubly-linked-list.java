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
        
        
        Node slow =head;
        
        Node  fast=head;
        
        while(fast!=null){
            
            if(fast.data!=x){
                int temp =slow.data;
                slow.data=fast.data;
                fast.data=temp;
                
                slow=slow.next;
            }
                fast=fast.next;
        }
        if(slow==head) return null;  //thhis means there are all elemnt which are key so deleet all 
        if(slow!=null){ // if no key is there then in that case slow and fast will be null
            
        slow.prev.next=null;  // slow is seating on the last key so gob  to prev and cut the list 
        }
        
        return head;
    }
}