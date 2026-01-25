// User function Template for Java

class Solution {
    static String isStringExist(String arr[], int N, String S) {
        // code here
        
        
        for(int i=0;i<N;i++){
            
            
            if(arr[i].length()==S.length()){
                
                String str= arr[i];
                int count =0;
                for(int j=0;j<S.length();j++){
                    if(str.charAt(j)!=S.charAt(j)){
                        count++;
                    }
                }
                
                if(count==1) return new String("True");
                
                
            }
            
        }
        
        return new String("False");
        
    }
}