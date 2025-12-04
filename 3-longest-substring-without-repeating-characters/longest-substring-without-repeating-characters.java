class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;

        while (j < s.length()) {

            // Add character at j
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            // If frequency > 1 → shrink from left
            while (map.get(c) > 1) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) map.remove(left);

                i++;  // shrink
            }

            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}
