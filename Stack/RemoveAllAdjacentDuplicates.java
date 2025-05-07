package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty()) {
                char prev = stack.peek();
                if (prev == current) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(current);
        }

        StringBuilder str = new StringBuilder();
        for (char ch : stack) {
            str.append(ch);
        }
        return str.toString();
    }
}
