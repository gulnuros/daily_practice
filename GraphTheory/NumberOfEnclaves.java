package GraphTheory;

public class NumberOfEnclaves {
    int m, n;

    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for (int row = 0; row < m; row++) {

            if (grid[row][0] == 1) {
                dfs(grid, row, 0);
            }

            if (grid[row][n - 1] == 1) {
                dfs(grid, row, n - 1);
            }
        }
        for (int col = 0; col < n - 1; col++) {
            if (grid[0][col] == 1) {
                dfs(grid, 0, col);
            }

            if (grid[m - 1][col] == 1) {
                dfs(grid, m - 1, col);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    ans += 1;
                }

            }
        }

        return ans;
    }

    private void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;

        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);

    }
}
