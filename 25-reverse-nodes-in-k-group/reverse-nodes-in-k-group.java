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


    public ListNode solution(ListNode head,int k){

        if(head==null)  return null;

        int count=0;
        ListNode temp = head;
        while(temp!=null && count<k){

            temp=temp.next;
            count++;

        }

        if(count<k)  return  head ; //no reversing 


        ListNode pre= null;
        ListNode current=head;
        count=0;
        while(count<k){
            ListNode next = current.next;
            current.next=pre;
            pre=current;

            current=next;
            count++;

        }


        head.next=solution(current,k);

        return pre;
    }

  
    public ListNode reverseKGroup(ListNode head, int k) {

        return solution(head,k);





        


        
    }
}