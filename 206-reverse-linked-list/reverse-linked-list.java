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
    public static ListNode  reverse(ListNode current,ListNode pre){

        if(current==null) {
            return pre;
        } 

        ListNode post =current.next;
        current.next=pre;
        pre=current;
        current=post;
       return  reverse(current,pre);
    } 
    public ListNode reverseList(ListNode head) {

          
          head= reverse(head,null);
          return head;
        
    }
}