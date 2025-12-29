class Solution {

    public int numIslands(char[][] grid) {

        int ans = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (!visited[i][j] && grid[i][j] == '1') {
                    ans++;
                    dfs(i, j, visited, grid);
                }
            }
        }

        return ans;
    }

    public void dfs(int i, int j, boolean[][] visited, char[][] grid) {

        int[] cols = {-1, 0, 1, 0};
        int[] rows = {0, -1, 0, 1};

        visited[i][j] = true;

        for (int d = 0; d < 4; d++) {

            int ni = i + rows[d];
            int nj = j + cols[d];

            if (ni >= 0 && nj >= 0 &&
                ni < grid.length && nj < grid[0].length &&
                !visited[ni][nj] && grid[ni][nj] == '1') {

                dfs(ni, nj, visited, grid);
            }
        }
    }
}
