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
    public ListNode mergeKLists(ListNode[] lists) {

        //it is linked list please give the head to all the linked list 

        PriorityQueue<Integer> minheap= new PriorityQueue<>((a,b)->a-b);

        for(int i=0;i<lists.length;i++){

        ListNode head= lists[i];


        while(head!=null){
          minheap.add(head.val);
          head=head.next;

        }

        

        }

        ListNode ans=new ListNode(0);
        ListNode current=ans;

        while(!minheap.isEmpty()){

            current.next= new ListNode(minheap.poll());
            current=current.next;


        }


        return ans.next;


        


        
    }
}