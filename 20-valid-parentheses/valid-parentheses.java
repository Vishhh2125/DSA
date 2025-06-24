class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                st.push(arr[i]);
            } else {
                if (st.isEmpty()) return false;

                if (arr[i] == '}' && st.peek() != '{') {
                    return false;
                }
                if (arr[i] == ')' && st.peek() != '(') {
                    return false;
                }
                if (arr[i] == ']' && st.peek() != '[') {
                    return false;
                }

                st.pop();
            }
        }
         if(st.isEmpty()==false) return false;
         else{
            return true;
         }
     
    }
}
