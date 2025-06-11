class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // prevent overflow
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to negative values (to handle Integer.MIN_VALUE safely)
        int a = dividend > 0 ? -dividend : dividend;
        int b = divisor > 0 ? -divisor : divisor;

        int result = 0;

        while (a <= b) {
            int temp = b;
            int multiple = 1;

            // Keep doubling the divisor while it fits in the dividend
            while (temp >= Integer.MIN_VALUE / 2 && a <= temp + temp) {
                temp += temp;
                multiple += multiple;
            }

            a -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }
}
