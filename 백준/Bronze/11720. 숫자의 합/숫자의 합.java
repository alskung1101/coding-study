import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        String Numbers;
        int sum = 0;
        N = scan.nextInt();
        Numbers = scan.next();
        for (int i = 0; i < N; i++) {
            sum += Numbers.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
