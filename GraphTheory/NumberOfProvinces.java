package GraphTheory;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        int n = isConnected.length;
        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, isConnected, visited);
                provinces++;
            }
        }

        return provinces;
    }

    public void dfs(int i, int[][] isConnected, int[] visited) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(j, isConnected, visited);
            }
        }
    }
}
