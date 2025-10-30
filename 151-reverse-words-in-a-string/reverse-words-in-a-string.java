class Solution {
    public String reverseWords(String s) {

        

        

     ArrayList<String> list = new ArrayList<>();
     int j =0;
    for(int i=0;i<s.length();i++){

       if(s.charAt(i)==' ' ){
          if(i>j){
            //valid string 
         list.add(s.substring(j,i));

          }

          while(i<s.length() && s.charAt(i)==' ') i++;

          j=i;
        
        
       }
    }

    if(j<s.length()){
        list.add(s.substring(j));
    }

    Collections.reverse(list);
     StringBuilder ans = new StringBuilder();

    for(String sub :list){

        if(ans.length()>0){
            ans.append(" ");
        }
        ans.append(sub);
        

    }

    return ans.toString();

     
        
    }
}