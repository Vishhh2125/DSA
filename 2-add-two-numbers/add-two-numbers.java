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
        

           int carry=0;
         
           ListNode temp1=l1;
           ListNode temp2=l2;
            ListNode ans= new ListNode();
            ListNode current=ans;

           while(temp1!=null && temp2!=null){

             int sum=temp1.val+temp2.val;

             if(carry>0){
                sum+=1;
                carry=0;
             }

             if(sum>9){
                sum=sum%10; //extract last dogit 
                carry=1;
             }
             current.next= new ListNode(sum);
             current=current.next;

             temp1=temp1.next;
             temp2=temp2.next;



           }


         

            while(temp1!=null){

                int sum =temp1.val;

                 if(carry>0){
                   sum+=1;
                  carry=0;
                }

                if(sum>9){
                sum=sum%10; //extract last dogit 
                carry=1;
             }

            current.next= new ListNode(sum);
            current=current.next;
            temp1=temp1.next;



            }

            while(temp2!=null){

                 int sum =temp2.val;

                if(carry>0){
                   sum+=1;
                  carry=0;
                }

                if(sum>9){
                        sum=sum%10; //extract last dogit 
                        carry=1;
                 }

                    current.next= new ListNode(sum);
                    current=current.next;
                    temp2=temp2.next;
            


            }


            if(carry>0){
                current.next=new ListNode(1);
            }

            return ans.next;
           
    }
}