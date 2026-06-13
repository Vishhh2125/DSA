class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int left =0;
        int right =0;


        for(int i =0;i<moves.length();i++){

            char ch =moves.charAt(i);

            if(ch=='L')  left++;
            if(ch=='R') right ++;

        }

        char dir ='L';

        if(right>left) dir='R';

        int ans=0;

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('L',-1);
        map.put('R',1);


        for(int i =0;i<moves.length();i++){
          

          if(moves.charAt(i)=='_'){
            ans+=map.get(dir);
          }else{
            ans+=map.get(moves.charAt(i));
          }
        }


        return Math.abs(ans);
        
    }
}