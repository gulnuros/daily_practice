package Stack;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        int currCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currCount++;
                stack.push(c);
            } else if (c == ')') {
                max = Math.max(currCount, max);
                stack.pop();
                currCount--;
                if (!stack.isEmpty()) {
                    currCount = stack.size();
                }
            }
        }
        return max;
    }
}
