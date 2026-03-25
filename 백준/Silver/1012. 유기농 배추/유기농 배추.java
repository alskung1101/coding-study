import java.util.Scanner;

public class Main {
    static int n, m, a[][];
    static int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            m = sc.nextInt(); n = sc.nextInt();
            int k = sc.nextInt();
            a = new int[n][m];
            int ans = 0;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt(), y = sc.nextInt();
                a[y][x] = 1; 
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                  
                    if (a[i][j] == 1) {
                        ans++; 
                        clear(i, j);
                    }
                }
            }
            System.out.println(ans);
        }
    }

    static void clear(int x, int y) {
        a[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i], ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m && a[nx][ny] == 1) {
                clear(nx, ny);
            }
        }
    }
}