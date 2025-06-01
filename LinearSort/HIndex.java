package LinearSort;

public class HIndex {
    public int hIndex(int[] citations) {

        for (int i = 0; i < citations.length - 1; i++) {
            for (int j = 0; j < citations.length - 1 - i; j++) {
                if (citations[j] > citations[j + 1]) {
                    int temp = citations[j];
                    citations[j] = citations[j + 1];
                    citations[j + 1] = temp;
                }
            }
        }
        int citationsMax = 0;
        int h = citations.length;
        for (int i = h; i >= 0; i--) {
            for (int j = h - 1; j >= 0; j--) {
                if (citations[j] >= i) {
                    citationsMax++;
                }
            }
            if (citationsMax >= i) {
                return i;
            }
            citationsMax = 0;
        }
        return 0;
    }
}
