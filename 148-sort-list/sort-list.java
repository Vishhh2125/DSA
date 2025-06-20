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
    public static ListNode sort   (ListNode head){

        // if(head==null)  return null;
    if(head.next==null)  return head;
      ListNode fast=head;
      ListNode slow =head;
      ListNode pre =null;

      while(fast!=null && fast.next!=null){
        fast=fast.next.next;
    //   ListNode post=slow.next;

        // slow.next=pre;
        pre=slow;
        slow=slow.next;
      }
      pre.next=null;   //breaking list into 2 parts 

      ListNode  left= sort(head);
      ListNode  right=sort(slow);

      ListNode  ans = merge(left,right);

      return ans; 

      

    }

    public static ListNode merge(ListNode head1,ListNode head2){

        ListNode anshead=new ListNode(0);
        ListNode current=anshead;
        while(head1!=null && head2!=null){
        if(head1.val<head2.val){
            
            current.next=head1;
            current=current.next;
            head1=head1.next;

        }else{

             current.next=head2;
            current=current.next;
            head2=head2.next;

          }
     }

        if(head1==null){
            while(head2!=null){
                
                current.next=head2;
            current=current.next;
            head2=head2.next;

            }
        }
        if(head2==null){

            while(head1!=null){
                 current.next=head1;
            current=current.next;
            head1=head1.next;
            }
            

        }


      return anshead.next;
        
    }
    public ListNode sortList(ListNode head) {

        if(head==null)  return null;
        if(head.next==null)  return head;

        head=sort(head);

        return head;


        
    }
}