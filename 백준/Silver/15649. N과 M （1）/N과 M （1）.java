import java.util.*;

public class Main {
    static int n, m;
    static int[] result;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        result = new int[m];
        used = new boolean[n + 1];

        pick(0);
    }

    static void pick(int count) {
        if (count == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {

            if (used[i]) continue;
            
            used[i] = true;
            result[count] = i;

            pick(count + 1);
            
            used[i] = false;
        }
    }
}