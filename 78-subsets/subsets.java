class Solution {

    public static void solution(int index,int[] input ,List<Integer>  output,List<List<Integer>> ans){

        if(input.length==index){

            ans.add(new ArrayList<>(output));
            return ;
        }

        
 
        output.add(input[index]);//include the number 

        solution(index+1,input,output,ans);//added num for combination
          output.remove(output.size()-1) ; //remove from teh last of the  list (backtrack)
        solution(index+1,input,output,ans);//not added num




        
        
    }
    public List<List<Integer>> subsets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
     
        solution(0,arr,new ArrayList<>(),ans);

        return ans;
        
    }
}