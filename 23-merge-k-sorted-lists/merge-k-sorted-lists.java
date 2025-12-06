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

        List<Integer>  arr= new ArrayList<>();


        for(int i=0;i<lists.length;i++){

            ListNode head= lists[i];


            while(head!=null){
                arr.add(head.val);
                head=head.next;
            }
        }


        Collections.sort(arr);

        ListNode ans= new ListNode(0);
         ListNode current=ans;
        for(Integer num :arr){
            current.next=new ListNode(num);
            current=current.next;
        }



      return ans.next;
        
    }
}