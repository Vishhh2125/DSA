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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0 && l1.next==null &&l2.val==0 && l2.next==null){
            return new ListNode(0);
        }
        ListNode head=new ListNode(0);
        ListNode tail=head;
         int carry =0;
          
        while(l1!=null || l2!=null  ){
            int num1=0;
            int num2=0; 
            if(l1!=null){

                num1=l1.val;
                l1=l1.next;

            }

            if(l2!=null){
                 num2=l2.val;
                l2=l2.next;

            }

            int total = num1+num2+carry;
             carry=0;//reset carry 
            int last_digit=total%10;
            if(total/10!=0){
                carry=total/10;

            }
             
             tail.next=new ListNode(last_digit);
            tail= tail.next;

        }

        if(carry!=0){
            tail.next=new ListNode(carry);
        }


        return head.next;
        
    }
}