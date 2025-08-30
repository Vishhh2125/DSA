class Solution {
    
    public static void swap(StringBuilder str,int index1,int index2){
        
        
        char temp =str.charAt(index1);
        str.setCharAt(index1,str.charAt(index2));
        str.setCharAt(index2,temp);
    }
    
  public static void solution(StringBuilder str, int start, ArrayList<String> ans) {
    if(start == str.length() - 1){
        ans.add(str.toString());
        return;
    }

    boolean []  used= new boolean[26] ;// NEW set for this recursion level

    for(int i = start; i < str.length(); i++){
        char ch = str.charAt(i);
        if(used[ch- 'A']==false){
            
            used[ch-'A']=true;
        

        swap(str, start, i);           // swap
        solution(str, start + 1, ans); // recurse
        swap(str, start, i);  
        
        
        }// backtrack
    }
}
    public ArrayList<String> findPermutation(String s) {
        // Code here
        
        

       StringBuilder str= new StringBuilder(s);

     
        ArrayList<String> ans= new ArrayList<>();
        
       solution(str,0,ans);
       
       return ans;
        
        
    
        
       
    }
}