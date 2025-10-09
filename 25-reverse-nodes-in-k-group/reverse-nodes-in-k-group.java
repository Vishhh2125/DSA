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
    public ListNode solution(ListNode head ,int k ){
        if (head==null)  return null;
        int count =0;
         ListNode node = head;
        while(node!=null && count<k){

            count++;
            node=node.next;
        }

        if(count<k)  return head ; // no need for the reverseing no complete grp 

        ListNode pre =null;
        ListNode current=head;
         count=0;
        while(count<k){
        
            ListNode post= current.next;
            current.next=pre;
            pre=current;
             current=post;

             count++;

            
        
        }

        head.next=solution(current,k);

        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        return solution(head,k);
        
    }
}