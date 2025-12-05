/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

         ListNode pre=null;
        ListNode current =node;


        while(current.next!=null){

            current.val=current.next.val;
            pre=current;
            current=current.next;


           


        }

        pre.next=null;


       


        
    }
}