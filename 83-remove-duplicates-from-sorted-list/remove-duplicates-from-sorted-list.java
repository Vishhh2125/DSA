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
    public ListNode deleteDuplicates(ListNode head) {

        

        HashSet<Integer> set = new HashSet<>();
          
          ListNode curr= head ;
           ListNode pre = null;
        while(curr!=null){

            if(set.contains(curr.val)){
                //remove this node 

                if(pre==null){
                    //shift head \
                    head=head.next;
                }else{
                    pre.next=curr.next;
                    curr=curr.next;
                    
                }


            }else{

            set.add(curr.val);
            pre=curr;
            curr=curr.next;
            }
            


        }
       



       
      return head;  
        
        
    }
}