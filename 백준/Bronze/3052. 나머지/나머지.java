import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int[] remainder = new int[42];
        int count = 0;
        Arrays.fill(remainder, 0);
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            for (int j = 0; j < remainder.length; j++) {
                if ((num[i] % 42) == j) {
                    remainder[j]++;
                }
            }
        }
        for (int i = 0; i < remainder.length; i++) {
            if (remainder[i] >=1) {
                count++;
            }
        }
        System.out.println(count);

    }
}
