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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size=0;
        ListNode current  =head;

        while(current!=null){
            current=current.next;
            size++;
        }
        


        int index=size-n;


        int curr_index=0;

        current=head;
        ListNode pre=null;


        while(current!=null){

            if(curr_index==index) break;

            pre=current;
            current=current.next;
            curr_index++;
        }

        if(index==0 ){
            head=head.next;
            return head;
            
        }

        pre.next=current.next;

        return head;
        
        
    }
}