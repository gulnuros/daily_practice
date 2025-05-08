package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        for (int st : students) {
            dq.add(st);
        }
        int count = 0;
        int i = 0;
        int failed = 0;
        while (!dq.isEmpty()) {
            if (sandwiches[i] == dq.peekFirst()) {
                dq.removeFirst();
                i++;
                count++;
                failed = 0;
            } else {
                dq.addLast(dq.removeFirst());
                failed++;
            }
            if (failed == dq.size()) {
                break;
            }
        }

        return failed;
    }
}
