class Solution {

    public static void solution(int [] arr,int current,List<Integer> output,List<List<Integer>> ans){

        


        ans.add(new ArrayList<>(output));



        for(int i= current;i<arr.length;i++){
        

            if( i>current  && arr[i-1]==arr[i]) continue ;


            output.add(arr[i]); //add

            solution(arr,i+1,output,ans);//recurse

            output.remove(output.size()-1); //backtrack


             
             

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {


        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);


        solution(nums,0,new ArrayList<>(),ans);

        return ans ;

        
    }
}