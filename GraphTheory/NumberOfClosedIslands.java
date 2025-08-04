package GraphTheory;

public class NumberOfClosedIslands {
    public int closedIsland(int[][] arr) {
        var res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0 && dfs(arr, i, j))
                    res++;
            }
        }
        return res;
    }

    public boolean dfs(int[][] arr, int i, int j) {
        if (i < 0 || j < 0 || i == arr.length || j == arr[0].length)
            return false;
        if (arr[i][j] == 1)
            return true;
        arr[i][j] = 1;
        return dfs(arr, i + 1, j) & dfs(arr, i - 1, j) & dfs(arr, i, j + 1) & dfs(arr, i, j - 1);
    }
}
