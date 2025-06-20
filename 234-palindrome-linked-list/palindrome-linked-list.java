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
    public boolean isPalindrome(ListNode head) {

        if(head.next==null)  return true;

        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=null;

        while(fast!=null && fast.next!=null){
               fast=fast.next.next;

                ListNode post=slow.next;
                slow.next=pre;
                pre=slow;
                slow=post;

         }
          
              ListNode list1=pre;
         ListNode list2=slow;
          if(fast!=null){
            //odd case 
            list2=slow.next;
          }
         
        

         while(list1!=null && list2!=null){

            if(list1.val!=list2.val)   return false ;
            list1=list1.next;
            list2=list2.next;
         }


         return true;

        
    }
}