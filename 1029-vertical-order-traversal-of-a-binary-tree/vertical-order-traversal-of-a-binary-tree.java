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

    public class  Pair{
        TreeNode node;
        int row;
        int col;


        Pair(TreeNode n  ,int r,int c ){
            this.node =n;
            this.row=r;
            this.col=c;

        }
    } 
    public List<List<Integer>> verticalTraversal(TreeNode root) {

      
         List<List<Integer>>  result= new ArrayList<>();

         Deque<Pair> q= new ArrayDeque<>();
        
         TreeMap<Integer,List<Pair>> map = new TreeMap<>();
                //col  Pair 
           q.offer(new Pair(root,0,0));

          while(!q.isEmpty()){
            int size=q.size();

           for(int i=0;i<size;i++){
            Pair current =q.poll();
            TreeNode node =current.node;
            int row=current.row;
            int col=current.col;
            
            if(map.containsKey(col)){
                List<Pair> list =map.get(col);
                list.add(current);
                map.put(col,list);

            }else{

                List<Pair> list=  new ArrayList<>();
                list.add(current);
                map.put(col,list);
            }

            if(node.left!=null) q.offer(new Pair(node.left,row+1,col-1));
            if(node.right!=null)  q.offer(new Pair(node.right,row+1,col+1));

           }

          }


        for(List<Pair> list : map.values()){
          Collections.sort(list,(a,b)->{
            if(a.row==b.row) return a.node.val-b.node.val;

            return a.row-b.row;

          });

           List<Integer> ans = new ArrayList<>();
          for(Pair p : list){
            ans.add(p.node.val);
        
          }


          result.add(ans);

          

        }

      
         return result;


    }
}