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

    public static  ListNode getnode(int index,ListNode head){
        int currentindex=-1;
        ListNode temp=head;

        while(temp!=null){
            currentindex++;

            if(currentindex==index)  break ;

              temp=temp.next;

        }

        return temp ;

    }
    public ListNode reverseList(ListNode head) {

        ListNode current=head;
        int size=0;

        while(current!=null){
            size++;
            current=current.next;
        }

      

        

        for(int i =0;i<size/2;i++){
              ListNode leftnode=getnode(i,head);
             ListNode rightnode=getnode(size-1-i,head);

             int temp = leftnode.val;
             leftnode.val=rightnode.val;
             rightnode.val=temp;

        }

        return head;



        

         
        
    }
}