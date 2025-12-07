/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        int size1=0;
        int size2=0;
         

         ListNode temp1=headA;
         ListNode temp2=headB;

        while(temp1!=null){
            temp1=temp1.next;
            size1++;

        }

          while(temp2!=null){
            temp2=temp2.next;
            size2++;

        }



         ListNode fast=null;
         ListNode slow=null;

         if(size1>size2){
            int diff=size1-size2;

            ListNode temp = headA;
            int count=0;
            fast=headA;
            while(count!=diff){
                fast=fast.next;
                count++;
            }

            slow=headB;
         }else{
            int diff=size2-size1;
            ListNode temp =headB;
            fast=headB;
             int count=0;
            while(count!=diff){
                fast=fast.next;
                count++;
            }
            slow=headA;
         }

         while( slow!=null && fast!=null && slow!=fast){

            fast=fast.next;
            slow=slow.next;

         }

        
         if(fast==slow)  return fast;
         else return null;



        
    }
}