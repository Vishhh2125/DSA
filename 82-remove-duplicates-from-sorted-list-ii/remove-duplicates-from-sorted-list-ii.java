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

        HashMap<Integer ,Integer> map = new HashMap<>();



        ListNode temp = head;

        while(temp!=null){
            
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }




        ListNode curr= head;
          ListNode pre=null;
        while(curr!=null){
            if(map.get(curr.val)>1){
                //remove this elemenets 
              int target_val=curr.val;
                while(curr!=null && curr.val==target_val ){
                  
                  
                    curr=curr.next;


                }

                if(pre==null){
                    head=curr;
                }else{

                    pre.next=curr;
                }



                
            }else{
                pre=curr;
                curr=curr.next;
            }
        }

        return head;
        
    }
}