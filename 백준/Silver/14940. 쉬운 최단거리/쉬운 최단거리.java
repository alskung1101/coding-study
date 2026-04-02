import java.util.*;

public class Main {
    static int n, m;
    static int[][] maze;
    static int[][] result;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        maze = new int[n][m];
        result = new int[n][m];
        visited = new boolean[n][m];

        int startX = 0, startY = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
                if (maze[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
            }
        }

        bfs(startX, startY);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j] == 1 && !visited[i][j]) {
                    sb.append("-1 ");
                } else {
                    sb.append(result[i][j] + " ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        result[x][y] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        result[nx][ny] = result[cx][cy] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}