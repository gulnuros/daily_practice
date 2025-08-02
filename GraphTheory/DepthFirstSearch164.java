package GraphTheory;

import java.util.Scanner;

//Component size
public class DepthFirstSearch164 {

    static int[][] graph;
    static boolean[] visited;
    static int componentsSize;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // numberOfVertices
        int s = in.nextInt(); // startVertex

        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = in.nextInt();
            }
        }
        visited = new boolean[n];
        componentsSize = 0;

        dfs(s - 1);
        System.out.println(componentsSize);
    }

    public static void dfs(int startVertex) {
        visited[startVertex] = true;
        componentsSize++;
        for (int j = 0; j < graph.length; j++) {
            if (graph[startVertex][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }
}
