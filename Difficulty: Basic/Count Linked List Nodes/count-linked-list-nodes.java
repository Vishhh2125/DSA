/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int size=0;
        Node current=head;
        while(current!=null){
            
            current=current.next;
            size++;
            
            
        }
        
        return size;
    }
}