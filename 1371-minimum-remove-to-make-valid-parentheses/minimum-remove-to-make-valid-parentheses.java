class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder ans = new StringBuilder(s);
        Deque<Integer> st = new ArrayDeque<>();

        // mark indexes to delete
        boolean[] remove = new boolean[s.length()];

        // first pass: remove invalid ')'
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    remove[i] = true;
                } else {
                    st.pop();
                }
            }
        }

        // second pass: remaining '(' are invalid
        while (!st.isEmpty()) {
            remove[st.pop()] = true;
        }

        // build output
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                finalStr.append(s.charAt(i));
            }
        }

        return finalStr.toString();
    }
}
