import java.util.Scanner;

public class Main {
    static int n, m, ans = 0;
    static char[][] a;
    static boolean[][] v;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new char[n][m];
        v = new boolean[n][m];

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
                if (a[i][j] == 'I') {
                    x = i; y = j;
                }
            }
        }

        dfs(x, y);

        if (ans == 0) System.out.println("TT");
        else System.out.println(ans);
    }

    static void dfs(int x, int y) {
        v[x][y] = true;
        if (a[x][y] == 'P') ans++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (a[nx][ny] != 'X' && !v[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}