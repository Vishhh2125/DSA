class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // counts of 'a','b','c'
        int left = 0, result = 0, unique = 0;

        for (int right = 0; right < s.length(); right++) {
            int rIndex = s.charAt(right) - 'a';
            count[rIndex]++;
            if (count[rIndex] == 1) unique++;

            while (unique == 3) {
                // For each valid window [left, right], 
                // all substrings starting at any index <= left and ending at right are valid
                result += s.length() - right;

                int lIndex = s.charAt(left) - 'a';
                count[lIndex]--;
                if (count[lIndex] == 0) unique--;
                left++;
            }
        }

        return result;
    }
}
