// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        
        
        ArrayList<String>  ans= new ArrayList<>();
        
        double total =  Math.pow(2,n);
        
        for(int i=0;i<total;i++){
            
        StringBuilder str= new StringBuilder("");
            boolean flag=true;
            int last =-1; //for intilaise it should not be equalt to one or zero 
            for(int j=n-1;j>=0;j--){
                //this si for how many size to generate 
                
                int bit = (i>>j) & 1;
                
                str.append(bit);
                
                if(bit==1 && last==1)  {
                    flag=false;
                    
                
                }
                
                last=bit;
                
                
            }
            
            
            if(flag==true){
                  ans.add(str.toString());
            }
        }
        
        
        return ans;
    }
}
