package Stack;

import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!stack.isEmpty()) {
                char prev = stack.peek();
                if (Character.toUpperCase(prev) == Character.toUpperCase(curr) && prev != curr) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(curr);
        }
        StringBuilder str = new StringBuilder();
        for (char ch : stack) {
            str.append(ch);
        }
        return str.toString();
    }
}
