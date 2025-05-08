package Stack;

import java.util.Stack;

public class ClearDigits {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char prev = stack.peek();
                if (Character.isLetter(prev) && Character.isDigit(c)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
