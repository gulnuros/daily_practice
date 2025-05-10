package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueue {
    class MyStack {
        Deque<Integer> input;

        public MyStack() {
            input = new ArrayDeque<>();
        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            return input.poll();
        }

        public int top() {

            return input.peek();
        }

        public boolean empty() {
            return input.isEmpty();
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
