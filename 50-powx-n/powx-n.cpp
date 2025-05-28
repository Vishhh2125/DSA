class Solution {
public:
    double myPow(double x, int n) {
         if (n == 0) return 1; // Base case: x^0 = 1
        
        long exp = n; // Convert int to long to avoid overflow
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result *= x; // If odd, multiply x
            x *= x; // Square x
            exp >>= 1; // Divide exponent by 2
        }

        return result;
        
    }
};






