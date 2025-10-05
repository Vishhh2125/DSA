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

    public static void solution(TreeNode current, StringBuilder output,List<String > ans ){

        if(current==null)  return ;

        //stoore sie to recurs the ans 
        int size= output.length();

        //add to the output 
         if(output.length()==0){
                  output.append(current.val); //add ans 

        }else{

                output.append("->"+current.val); //add ans 
        }


        
         // if leaf node add ans 
        if(current.left==null && current.right==null){
            ans.add(new String(output.toString()));//add to ans 
             output.setLength(size); //backtrack

            return ;
            
        }
        
       

        
            //go left 
            solution(current.left,output,ans);//recurse
             // go right 
            solution(current.right,output,ans); ///recurse
          output.setLength(size); //backtrack only one time beacuse we need teh same input in both th funtion 


        


    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        solution(root,new StringBuilder(),ans);

        return ans ;
        
        
    }
}