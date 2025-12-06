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
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);


        ListNode current1=small;
        ListNode current2=large;


        while(head!=null){

            if(head.val<x){
                //add to small 

                current1.next=head;
                head=head.next;
                current1=current1.next;
                current1.next=null;

            }else{
                current2.next=head;
                head=head.next;
                current2=current2.next;
                current2.next=null;
            }
        }
        

        current1.next=large.next;

        return small.next;
    }
}