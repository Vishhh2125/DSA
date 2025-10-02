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

    public static void solution(TreeNode current,int level,int row,TreeMap<Integer,List<Pair>> map){
        if(current==null)  return ;

        if(map.containsKey(level)){
            map.get(level).add(new Pair(current.val,row));
        }else{
           List<Pair> list= new ArrayList<>();
           list.add(new Pair(current.val,row));
            map.put(level,list);
        }

        solution(current.left,level-1,row+1,map);
        solution(current.right,level+1,row+1,map);


    }
     static class Pair {
          int val;
        int row;
        Pair(int val, int row) {
            this.val = val;
            this.row = row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer,List<Pair>> map = new TreeMap<>();
        List<List<Integer>> ans= new ArrayList<>();
            
        solution(root,0,0,map);

        for(Integer key: map.keySet()){
            List<Integer> ans_list= new ArrayList<>();
            List<Pair> list=map.get(key);
          Collections.sort(list,(a,b)->{
            if(a.row==b.row) return a.val-b.val;
            else return  a.row-b.row;
          });


          for(Pair p : list) ans_list.add(p.val);

            ans.add(ans_list);
           
        }

     return ans ;
        
    }
}