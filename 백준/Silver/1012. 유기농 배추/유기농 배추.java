import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        while (T-- > 0) {
            M = sc.nextInt(); 
            N = sc.nextInt(); 
            K = sc.nextInt(); 

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1; 
            }

            int count = 0; 
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                  
                    if (map[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        count++; 
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}