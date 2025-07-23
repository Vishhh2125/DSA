class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer>  Map = new HashMap<>();


        Map.put('I',1);
        Map.put('V',5);
        Map.put('X',10);
        Map.put('L',50);
         Map.put('C',100);
        Map.put('D',500);
        Map.put('M',1000);

           int ans=0;
           

       for(int i=0;i<s.length();i++){

        int curr=Map.get(s.charAt(i));

         int next=0;
                if(i+1<s.length()){
                    next=Map.get(s.charAt(i+1));
                    
                }

        if(curr<next){
            ans-=curr;
        }else{
            ans+=curr;
        }

       }


        return ans;







        
        
    }
}