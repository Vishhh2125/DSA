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
    public ListNode reverseList(ListNode head) {

        if(head==null)  return null;

        ListNode pre=null;
        
         ListNode current=head;
        while(current!=null){
            ListNode post=current.next;  // save next node refernce 
            current.next=pre;         //pont current to the pre 
            pre=current;                 // give pre to current
            current=post;                   //set current to the next node 
             
        
        }
        head=pre;  //it will come to tail pointer

        return head;
        
    }
}