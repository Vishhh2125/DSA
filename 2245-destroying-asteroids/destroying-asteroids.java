class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);

        long mas=(long)mass;
        for(int num :asteroids){

            if(mas<num)  return false;
            mas+=(long) num;
        }



        return true ;

        
    }
}