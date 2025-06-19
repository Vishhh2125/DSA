/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        
       Node slow =head;
       Node fast =head;
       
       
       while(fast!=null && fast.next!=null){
           
           slow=slow.next;
           fast=fast.next.next;
           
           if(slow==fast) break ;
           
       }
       if(fast==null || fast.next==null)  return 0;
       
       int count =0;
       
       do{
           slow=slow.next;
           count++;
       }while(slow!=fast);
       
       
       return count;
    }
}