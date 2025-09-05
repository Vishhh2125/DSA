class Solution {


    public static boolean valid(int start ,int end,String s ){
         //validity is through palindrome 

        for(int i=start;i<=start+(end-start)/2;i++){
            if (s.charAt(i) != s.charAt(end - (i - start))) {
                return false;
            }



        }

        return true;
    }

    public static void solution(int start ,List<String> output ,String s,List<List<String>> ans ){

        if(start==s.length()){
            ans.add(new ArrayList<>(output));

            return;

        }

        for(int i=start;i<s.length();i++){

            

            if(valid(start,i,s)){

                output.add(s.substring(start,i+1)); //add ans 

                 solution(i+1,output,s,ans);  //recurse

                 output.remove(output.size()-1);//backtrack
            }
            


        }
    }
    public List<List<String>> partition(String s) {

       List<List<String>> ans= new ArrayList<>();

       solution(0,new ArrayList<>(),s,ans);

       return ans ;
        
    }
}