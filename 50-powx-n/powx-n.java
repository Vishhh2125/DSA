class Solution {

    private double pow(double x, long n) {
        if (n == 0) return 1.0;

        double half = pow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;      // even
        } else {
            return half * half * x;  // odd
        }
    }

    public double myPow(double x, int n) {
        long N = n;  // convert to long to handle Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return pow(x, N);
    }
}
