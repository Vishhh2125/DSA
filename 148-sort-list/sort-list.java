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
    public ListNode sortList(ListNode head) {


        if(head==null)  return null ;
        if(head.next==null)  return head;
        ListNode fast =head;
        ListNode slow= head;
        ListNode pre=null;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            pre=slow;
            slow=slow.next;
        }

         pre.next=null;
        ListNode left= sortList(head);
        ListNode right= sortList(slow);

       return  merge(left,right);
        
    }

    public ListNode merge (ListNode left ,ListNode right ){

        ListNode head = new ListNode(0);

        ListNode current=head;

        while(left!=null && right!=null){

            if(left.val<right.val){
                current.next=new ListNode(left.val);
                current=current.next;
                left=left.next;
                
            }else{
                current.next= new ListNode(right.val);
                current=current.next;
                right=right.next;
            }
        }

        if(left!=null){
            current.next=left;
        }

        if(right!=null){
            current.next=right;
        }


        return head.next;
    }
}