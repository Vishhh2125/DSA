class Solution {
    public double angleClock(int hour, int minutes) {

         
        double hr_angle=(360/12.0)*  (double) (hour%12.0);
        double min_angle=(360/60.0) * (double)minutes;
        hr_angle=hr_angle+(minutes/60.0*30);
        hr_angle=hr_angle%360.0;

    double diff=Math.abs(hr_angle-min_angle);

    if(360-diff<diff){
        return 360-diff;
    }

    return diff;


        
    }
}