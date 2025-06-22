// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head.next==null) return head;
        Node slow=head;
        Node fast=head.next;
        int  last=-1;
        
        while(fast!=null){
            
            if(slow.data!=fast.data){
                slow=slow.next;
                int temp=slow.data;
                slow.data=fast.data;
                fast.data=temp;
                
                
            }
                fast=fast.next;


        }
        
        slow.next=null;
        return head;
    }
}