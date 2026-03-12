import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int k = 0;
        int n = 0;
        for (int i = 0; i < T; i++) {
            k = scanner.nextInt();
            n = scanner.nextInt();
            System.out.println(peopleNum(k, n));

        }

    }

    static int peopleNum(int k, int n) {
        int sum = 0;
        if ((k - 1) == 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            for (int i = 1; i <= n; i++) {
                sum += peopleNum(k - 1, i);
            }
            return sum;
        }
    }
}
