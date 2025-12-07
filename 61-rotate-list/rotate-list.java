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


        if(head==null)  return null;
        if(head.next==null) return head;  

        int size=0;

        ListNode temp =head;

        while(temp!=null){
            temp=temp.next;
            size++;
        }

        k=k%size;

        ListNode fast = head;
        ListNode slow=head;
         

         int count=0;

        while(count<k){
            fast=fast.next;
            count++;
        }


        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }

        fast.next=head;
        head=slow.next;
        slow.next=null;


        return head;


        
    }
}