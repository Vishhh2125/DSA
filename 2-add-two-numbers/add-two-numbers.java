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

       ListNode  temp1=l1;
        ListNode temp2=l2;
        int carry=0;
         ListNode ans = new ListNode(0);
         ListNode current=ans;
        while(temp1!=null || temp2!=null){

            int val1=temp1!=null ? temp1.val :0;
            int val2=temp2!=null? temp2.val :0;


            int sum =val1+val2;


            if(carry>0){
                sum=sum+1;
                carry=0;
            }

            if(sum>9){
                sum=sum%10;
                carry=1;
            }


            current.next= new ListNode(sum);
            current=current.next;
            if(temp1!=null){
            temp1=temp1.next;

            }
            if(temp2!=null){

            temp2=temp2.next;
            }





        }


        if(carry>0){
            current.next= new ListNode(1);
        }

        return ans.next;
        
    }
}