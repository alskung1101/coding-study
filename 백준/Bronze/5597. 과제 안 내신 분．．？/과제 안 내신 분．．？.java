import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = scanner.nextInt();
            num[n - 1] = 1;
        }
        for (int h = 0; h < 30; h++) {
            if (num[h] != 1) {
                System.out.println(h + 1);
            }
        }
    }
}