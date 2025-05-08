package Stack;

import java.util.Stack;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String op : logs) {

            if (op.equals("./")) {
                continue;
            } else if (op.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    continue;
                }
            } else {
                stack.push(op);
            }
        }

        return stack.size();
    }
}
