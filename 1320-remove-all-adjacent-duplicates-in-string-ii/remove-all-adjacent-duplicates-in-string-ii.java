class Solution {

    public class Pair{
        char ch ;
        int count;

        Pair(char ch ){
            this.ch=ch;
            this.count=1;
            
        }
    }
    public String removeDuplicates(String s, int k) {


      Deque<Pair> st = new ArrayDeque<>();


      for(int i=0;i<s.length();i++){

        if(st.isEmpty() || s.charAt(i)!=st.peek().ch){
            st.push(new Pair(s.charAt(i)));

        }else{
          

          Pair top= st.pop();
          top.count++;

          if(top.count<k){
            st.push(top);
          }
        }
      }

      StringBuilder ans = new StringBuilder();

      for(Pair p:st){

        for(int i=0;i<p.count;i++){

            ans.append(p.ch);

        }
      }
    


    return ans.reverse().toString();

        
    }
}