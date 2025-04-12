class Solution {
    public char[][] rotateTheBox(char[][] box) {
        final int m = box.length, n = box[0].length;

        char[][] res = new char[n][m];
        for (int i = 0; i < m; i++) {
            processRow(box[i], res, n, i, m);
        }
        return res;
    }

    void processRow(char[] boxRow, char[][] res, final int n, int i, final int m) {

        for (int j = n - 1, lowestEmpty = n - 1; j >= 0; j--) {

            res[j][m - i - 1] = '.';

            if (boxRow[j] != '.') {
                lowestEmpty = boxRow[j] == '*' ? j : lowestEmpty;
                res[lowestEmpty][m - i - 1] = boxRow[j];
                lowestEmpty--;
            }
        }
    }
}