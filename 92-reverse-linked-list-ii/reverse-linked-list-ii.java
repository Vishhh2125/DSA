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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode pre_list=null;
        ListNode post_list=null;
        ListNode current=null;
          ListNode temp=head;
          ListNode pre=null;
            int count=1;

        while(temp!=null){

            if(count==left){
                pre_list=pre;
                current=temp;
            }

            if(count==right){
                post_list=temp.next;
                temp.next=null;
              


            }

            pre=temp;
            temp=temp.next;
            count++;

        }


        pre=post_list;


        while(current!=null){
            ListNode next= current.next;
            current.next=pre;
            pre=current;
            current=next;
        }


        if(pre_list!=null){
            pre_list.next=pre;
           return head ;
        }


        return pre;

        
    }
}