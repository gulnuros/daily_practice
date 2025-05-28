import java.util.Arrays;

public class DeleteGreatestValueinEachRow {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
        int m = grid.length; // rows
        int n = grid[0].length; // col
        int sum = 0;
        for (int col = n - 1; col >= 0; col--) {
            int max = 0;
            for (int row = 0; row < m; row++) {
                max = Math.max(max, grid[row][col]);
            }
            sum += max;
        }
        return sum;
    }
}
