class Solution {

    public static void solution(List<Integer> input ,List<Integer>  output,List<List<Integer>> ans){

        if(input.size()==0){

            ans.add(output);
            return ;
        }

        int num=input.get(0); //extract first element 
            input.remove(0);//remove first element 

        ArrayList<Integer>  output1=new ArrayList<>(output);
        output1.add(num); 

         ArrayList<Integer>  output2=new ArrayList<>(output);

        solution(new ArrayList<>(input),output1,ans);//added num for combination
        solution(input,output2,ans);//not added num
        
    }
    public List<List<Integer>> subsets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input=new ArrayList<>();
          for(int num:arr){
            input.add(num);

          }
        solution(input,new ArrayList<>(),ans);

        return ans;
        
    }
}