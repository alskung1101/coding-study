import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        int M = 1;
        int sum1;
        int sum2 = 0;
        int result = 0;
        N = scan.nextInt();
        while (sum2 < 1000000) {
            sum1=0;
            String s = String.valueOf(M);
            for (int i = 0; i < s.length(); i++) {
                sum1 += s.charAt(i) - '0';
            }
            sum2 = M + sum1;

            if (sum2 == N) {
                result = M;
                break;
            }
            M++;
        }
        System.out.println(result);
    }

}

