import java.util.HashSet;
import java.util.Set;

public class Unique3DigitEvenNumbers {
    public int totalNumbers(int[] digits) {
        Set<Integer> res = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && k != i) {
                        int d1 = digits[i];
                        int d2 = digits[j];
                        int d3 = digits[k];
                        if (d1 != 0 && d3 % 2 == 0) {
                            int num = d1 * 100 + d2 * 10 + d3;
                            res.add(num);
                        }
                    }
                }
            }
        }

        return res.size();
    }
}
