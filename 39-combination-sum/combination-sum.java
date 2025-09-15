class Solution {

    public static void solution(int index,int[]arr,int sum,int target ,List<Integer> output ,List<List<Integer>>  ans){

        if(index==arr.length){
            return ;

        }

        if(sum==target){
            ans.add(new ArrayList<>(output));
            return ;
        }
        if(sum>target){
            return;
        }



        for(int i=index;i<arr.length;i++){

            output.add(arr[i]);//added into ans 


            solution(i,arr,sum+arr[i],target,output,ans); //recurse

            output.remove(output.size()-1); //backtrack by removing the last index
            
        }
    }



    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>>  ans= new ArrayList<>();

        solution(0,candidates,0,target,new ArrayList<>(),ans);


        return ans ;
        
    }
}