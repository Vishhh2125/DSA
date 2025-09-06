class Solution {

    public static void solution(String digits ,int current,StringBuilder output,List<String> ans,HashMap<Integer,String> map ){

        if(output.length()==digits.length()){
           ans.add(output.toString());
           return ;
        }

            String input= map.get(digits.charAt(current)-'0');  // we will get teh string for r=teh digit 

          for(int i=0;i<input.length();i++){

            output.append(input.charAt(i)); //added to teh ans 

              solution(digits,current+1,output,ans,map);//recurse

              output.deleteCharAt(output.length()-1);//backtrack


           




          }




    }
    public List<String> letterCombinations(String digits) {

         if(digits.length()==0)  return new ArrayList<>();
        HashMap<Integer,String>  map = new HashMap<>();

        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        List<String> ans = new ArrayList<>();

        solution(digits,0,new StringBuilder(),ans,map);

        return ans;



        
    }
}