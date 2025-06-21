/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)  return head;
        ListNode current=head;
        int size=0;
        while(current!=null){
            size++;
            current=current.next;

        }
        k=k%size;
        if( k==0 )  return head;
        

        

        // return new ListNode(size);

        int count=0;
        current=head;
        
        while(count!=size-k-1){
            count++;
            current=current.next;
            
        }

        ListNode newHead=current.next;
        current.next=null;
        

        current=newHead;

        while(current.next!=null){
            current=current.next;
        }

        current.next=head;


        return newHead;
        
    }
}