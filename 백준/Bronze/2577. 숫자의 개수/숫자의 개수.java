import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        String total = String.valueOf(A * B * C);
        int[] count = new int[10];
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < total.length(); j++) {
                if ((total.charAt(j) == (char) ('0' + i))) {
                    count[i]++;
                }
            }
            System.out.println(count[i]);
        }
    }
}
