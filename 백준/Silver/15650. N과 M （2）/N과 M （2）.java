import java.util.*;

public class Main {
    static int n, m;
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        result = new int[m];

        dfs(0, 1);
    }

    static void dfs(int depth, int start) {

        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {

            result[depth] = i;

            dfs(depth + 1, i + 1);
        }
    }
}