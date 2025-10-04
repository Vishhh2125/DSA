/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static class  Pair{

        int val;
        int row;

        Pair(int val,int row){
            this.row=row;
            this.val=val;
        }
    }
    public static void solution(TreeNode current,int col,int row,TreeMap<Integer,List<Pair>>map){
        if(current==null)  return;
        


          //left
        solution(current.left,col-1,row+1,map);


        //print 
        if(map.containsKey(col)){
            //if column key already present 
            map.get(col).add(new Pair(current.val,row));
        }else{
             // if column key nor present cerate arraylist instance and add it with value 
            List<Pair> list= new ArrayList<>();
             list.add( new Pair(current.val,row));

             map.put(col,list);
        }


        // right 
        solution(current.right,col+1,row+1,map); //right 
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
     

     List<List<Integer>> ans = new ArrayList<>();

     TreeMap<Integer,List<Pair>> map = new TreeMap<>();


     solution(root,0,0,map);


     for(Integer key :map.keySet()){
        

        List<Pair> list  = map.get(key);
        Collections.sort(list,(a,b)->{
            
            if(a.row==b.row)  return a.val-b.val;
            else  return a.row-b.row;
        });

          List<Integer> ans_sublist = new ArrayList<>();
        for(Pair p:list){
          
          ans_sublist.add(p.val);

        }

        ans.add(ans_sublist);
     }

        
    return ans ;
        
    }
}