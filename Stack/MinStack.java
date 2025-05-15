package Stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<Integer> data;
    List<Integer> min_values;

    public MinStack() {
        data = new ArrayList<>();
        min_values = new ArrayList<>();
    }

    public void push(int val) {
        data.add(val);
        if (min_values.isEmpty() || min_values.get(min_values.size() - 1) >= val) {
            min_values.add(val);
        } else {

            min_values.add(min_values.get(min_values.size() - 1));
        }

    }

    public void pop() {
        data.remove(data.size() - 1);
        min_values.remove(min_values.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return min_values.get(min_values.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
