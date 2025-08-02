package GraphTheory;

import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, 0, visited);
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;

    }

    public void dfs(List<List<Integer>> rooms, int v, boolean[] visited) {
        visited[v] = true;
        for (int key : rooms.get(v)) {
            if (!visited[key]) {
                dfs(rooms, key, visited);
            }
        }
    }
}
