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
    public ListNode removeElements(ListNode head, int val) {


        ListNode ans = new ListNode(0);
        ListNode current= ans;


        while(head!=null){


            if(head.val!=val){
                ListNode next = head.next;
                current.next=head;
                current=current.next;
                current.next=null;
                head=next;
            }else{
             

             head=head.next;
            }
        }


        return ans.next;
        
    }
}