package Stack;

import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char current : s.toCharArray()) {
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char prev = stack.peek();
                if ((current == ')' && prev == '(') || (current == '}' && prev == '{')
                        || (current == ']' && prev == '[')) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }
}