/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Node current =head;
        
        while(current!=null){
            
            if(set.contains(target-current.data)){
                
             ArrayList<Integer> pair = new ArrayList<>();
             
             pair.add(target-current.data);
             pair.add(current.data);
             
             ans.add(pair);
            }
            
            
            set.add(current.data);
            
            current=current.next;
            
            
            
        }
        
        Collections.reverse(ans);
        
        return  ans;
    }
}
