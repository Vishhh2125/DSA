/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {


        HashMap<Node ,Node > map = new HashMap<>();

        Node curr= head;

        while(curr!=null){

            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        //sytored mapping of ndes and its new Nodes



        Node ans= new Node(0);

        curr=head;
       Node  ans_curr=ans;

        while(curr!=null){

            Node newNode= map.get(curr);
            ans_curr.next=newNode;
            ans_curr=ans_curr.next;
            if(curr.random==null){
                ans_curr.random=null; 
            }else{
                ans_curr.random= map.get(curr.random);
            }

            curr=curr.next;
        }

        return ans.next;

        
    }
}