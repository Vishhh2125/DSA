class Solution {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets → push
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else { // Closing brackets

                // No opening bracket available
                if (st.isEmpty()) return false;

                char top = st.pop();

                // Check correct matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // Stack must be empty at end
        return st.isEmpty();
    }
}
