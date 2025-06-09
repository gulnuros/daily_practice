package Greedy;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";
        if (k == 0)
            return num;

        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && !stack.empty() && num.charAt(i) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));

            if (stack.size() == 1 && stack.peek() == '0') {
                stack.pop();
            }
        }
        while (k > 0 && !stack.empty()) {
            stack.pop();
            k--;
        }
        while (!stack.empty()) {
            res.append(stack.pop());
        }
        res.reverse();
        if (res.length() == 0)
            return "0";
        return res.toString();
    }
}
