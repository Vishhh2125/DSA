class Solution {

    public void reverse(StringBuilder s ){

        int i=0;
            int j =s.length()-1;

        while(i<j){
            char temp= s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reverseByType(String s) {

        StringBuilder str1= new StringBuilder();
         StringBuilder str2= new StringBuilder();


        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                str1.append(s.charAt(i));
            }else{
                str2.append(s.charAt(i));
            }
        }


        reverse(str1);
        reverse(str2);
         int index1=0;
        int index2=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                ans.append(str1.charAt(index1));
                index1++;
                
                
            }else{
                ans.append(str2.charAt(index2));
                index2++;
            }
            
        }

        return ans.toString();

        
        
    }
}