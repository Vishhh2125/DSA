/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        
        
        DLLNode current=head;
        DLLNode pre=null;
        
        while(current!=null){
            
            DLLNode temp=current.next;
            current.next=current.prev;
            current.prev=temp;
            pre=current;
            current=current.prev;
        }
        
        head=pre;
        
        
        return head;
    }
}