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


        ListNode fast  = head;
        ListNode slow = head ;
         ListNode pre=null;

        int current=0;

        while(current!=n){
            fast=fast.next;
            current++;
        }
        

        while(fast!=null){
            fast=fast.next;
            pre=slow;
            slow=slow.next;
        }


        if(slow==head){

            head=head.next;
            return head;
        }


        pre.next=slow.next;

        return head;


    }
}