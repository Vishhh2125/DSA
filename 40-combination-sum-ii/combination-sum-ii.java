import java.util.*;

class Solution {

    public static void solution (int[] arr,int target ,int index,int sum ,
                                 List<Integer> output ,List<List<Integer>> ans ){

        if(sum==target ){
            ans.add(new ArrayList<>(output));
            return; // stop further recursion
        }

        if(sum>target || index==arr.length){
            return ;
        }

        // ----- SKIP DUPLICATES -----
        // don't take current element
        int next = index + 1;
        while (next < arr.length && arr[next] == arr[index]) {
            next++; // jump over duplicates
        }
        solution(arr,target,next,sum,output,ans);

        // ----- TAKE CURRENT ELEMENT -----
        output.add(arr[index]);
        solution(arr,target,index+1,sum+arr[index],output,ans);
        output.remove(output.size()-1); // backtracking
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // sort for duplicate handling
        List<List<Integer>> ans = new ArrayList<>();
        solution(candidates,target,0,0,new ArrayList<>(),ans);
        return ans ;
    }
}
