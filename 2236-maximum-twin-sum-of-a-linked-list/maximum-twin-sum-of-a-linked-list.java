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
    public int pairSum(ListNode head) {

        

        ListNode slow = head ;
        ListNode fast = head ;

        
        while(fast!=null && fast.next!=null){


            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev =null;


        while(slow!=null){

            ListNode post =slow.next;
            slow.next=prev;
            prev=slow;
            slow=post;
        }



        int max=0;


        ListNode l1=head;
        ListNode l2=prev;



        while(l2!=null ){


            max=Math.max(max,l1.val+l2.val);

            l2=l2.next;
            l1=l1.next;
        }


     


        return max;
        
    }
}