import java.util.Arrays;

class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m = matrix[0].length;
        int[][] newmat = new int[m][matrix.length];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newmat[i][j] = matrix[j][i];
            }
        }
        return newmat;
    }

    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] res = tm.transpose(matrix);
        System.out.println(Arrays.deepToString(res));
    }
}