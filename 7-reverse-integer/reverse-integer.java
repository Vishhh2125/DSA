class Solution {
    public int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int last = x % 10;
            x = x / 10;

            ans = ans * 10 + last;
        }

        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}
