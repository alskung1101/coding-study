import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        while (!(a == 0 && b == 0 & c == 0)) {
            int[] arr = new int[3];
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;
            Arrays.sort(arr);
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

        }
    }
}
