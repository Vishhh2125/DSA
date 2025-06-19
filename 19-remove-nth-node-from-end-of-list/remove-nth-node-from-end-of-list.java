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

        int size=1;
        ListNode current=head;

        while(current.next!=null){

            current=current.next;
            size++;
        }
         //condition for only one node 
        if(size==1){
            head=null;
            return head;
        }
        //condiiton for removing yhe first node 
        if(size==n){
            //removing the first element 
            return head.next;
        }

        int count=0;

        current=head;
        ListNode pre=null;


        while(count!=size-n){
            pre=current;
            current=current.next;
            count++;
        }

          pre.next=current.next;



        return head;

        
    }
}