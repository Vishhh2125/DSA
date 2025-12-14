class Solution {
    public String simplifyPath(String path) {

        int i = 0;
        Stack<String> st = new Stack<>();

        while (i < path.length()) {

            // skip multiple '/'
            if (path.charAt(i) == '/') {
                while (i < path.length() && path.charAt(i) == '/') i++;
            }

            // handle dots
            else if (path.charAt(i) == '.') {
                int count = 0;

                while (i < path.length() && path.charAt(i) == '.') {
                    i++;
                    count++;
                }

                // ".."
                if (count == 2 && (i == path.length() || path.charAt(i) == '/')) {
                    if (!st.isEmpty()) st.pop();
                }
                // "." → do nothing
                else if (count == 1 && (i == path.length() || path.charAt(i) == '/')) {
                    // ignore
                }
                // valid directory like "...", ".a"
                else {
                    StringBuilder sb = new StringBuilder();
                    while (count-- > 0) sb.append('.');
                    while (i < path.length() && path.charAt(i) != '/') {
                        sb.append(path.charAt(i));
                        i++;
                    }
                    st.push(sb.toString());
                }
            }

            // handle directory names
            else {
                StringBuilder sb = new StringBuilder();
                while (i < path.length() && path.charAt(i) != '/') {
                    sb.append(path.charAt(i));
                    i++;
                }
                st.push(sb.toString());
            }
        }

        StringBuilder ans = new StringBuilder();
        for (String dir : st) {
            ans.append("/").append(dir);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}
