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

    public void solution(TreeNode current,List<String > ans ,StringBuilder output ){
         if(current==null )  return ;


        //add into output 
        if(output.length()==0){
            output.append(current.val+"");
        }else{
            
            output.append("->"+current.val+"");

        }

        int size=output.length();

        //search for left 
        solution(current.left,ans,output);
        //backtrack
        String str1=output.substring(0,size);
        output= new StringBuilder(str1);
        //search for right
        solution(current.right,ans,output);
        //backtrack 
        String str2=output.substring(0,size);
        output= new StringBuilder(str2);

        if(current.left==null && current.right==null){
            ans.add(new String (output.toString()));
            
        }




    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans= new ArrayList<>();

        solution(root,ans,new StringBuilder());


        return ans ;

        
    }
}