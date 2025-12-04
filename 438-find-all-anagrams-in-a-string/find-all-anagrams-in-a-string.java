class Solution {

    public boolean isValid(int [] arr){

        for(int i=0;i<26;i++){

            if(arr[i]!=0)  return false;
        }

        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {

    List<Integer> ans = new ArrayList<>();

      int  [] arr= new int [26];

    for(int i =0;i<p.length();i++){

        arr[p.charAt(i)-'a']++;


    }



    int i =0;
    int j =0;

    for(;j<s.length();j++){
        int index= s.charAt(j)-'a';

        arr[index]--;

        if(j-i+1==p.length()){

           
            if(isValid(arr)){
              ans.add(i);

            }
            

            arr[s.charAt(i)-'a']++;
            i++;

        }
    }
        return ans;
    }
}