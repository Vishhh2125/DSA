class Solution {
    public List<List<Integer>> generate(int row) {
         List<List<Integer>> ans= new ArrayList<>();
           for (int i = 0; i < row; i++) {
         ans.add(new ArrayList<>()); // \U0001f511 create row before accessing
        }
         if(row==1){
            ans.get(0).add(1);

            return ans;
         }
        for(int i=0;i<row;i++){

            if(i==0){
            ans.get(i).add(1);
            continue;

            }
           
           for(int j=0;j<=i;j++){
                if(j==0){
                 ans.get(i).add(1);

                 }else if(j==i){
                 ans.get(i).add(1);


                 }else{

                int num1=ans.get(i-1).get(j-1);
                int num2=ans.get(i-1).get(j);
                 ans.get(i).add(num1+num2);
                 }
             }
        }

        return ans;
        
    }
}