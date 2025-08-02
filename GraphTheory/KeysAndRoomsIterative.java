package GraphTheory;

import java.util.List;
import java.util.Stack;

public class KeysAndRoomsIterative {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        while (!stack.empty()) {
            int room = stack.pop();
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    stack.push(key);
                }
            }
        }

        for (boolean v : visited) {
            if (!v)
                return false;
        }
        return true;
    }
}
