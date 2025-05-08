package Stack;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty()) {
                char prev = stack.peek();
                if ((prev == 'A' && current == 'B') || (prev == 'C' && current == 'D')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(current);
        }

        return stack.size();
    }
}
