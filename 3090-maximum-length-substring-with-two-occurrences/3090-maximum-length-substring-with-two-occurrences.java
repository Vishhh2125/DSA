class Solution {

    int[] arr;

    public boolean isValid() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2) {
                return false;
            }
        }
        return true;
    }

    public int maximumLengthSubstring(String s) {

        arr = new int[26];

        int max = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);
            arr[ch - 'a']++;

            while (!isValid()) {

                arr[s.charAt(i) - 'a']--;
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}