class Solution {

    // check if word exists starting from (x, y)
    public static boolean solution(int x, int y, char[][] board, String word, int current) {
        // base case: full word matched
        if (current == word.length()) return true;

        // out of bounds
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;

        // mismatch
        if (board[x][y] != word.charAt(current)) return false;

        char temp = board[x][y];
        board[x][y] = '#'; // mark visited

        // try all 4 directions
        boolean ans = solution(x + 1, y, board, word, current + 1) ||
                      solution(x - 1, y, board, word, current + 1) ||
                      solution(x, y + 1, board, word, current + 1) ||
                      solution(x, y - 1, board, word, current + 1);

        board[x][y] = temp; // backtrack
        return ans;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (solution(i, j, board, word, 0)) return true;
            }
        }
        return false;
    }
}
