// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        
        Node current= head;
        int currentsize=1;
        while(currentsize<=n){
            
            if(current.data==key) return true;
            
            current=current.next;
            currentsize++;
        }
        
        
        return false;
    }
}