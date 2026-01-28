import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = 0;
        int maxNum = 0;
        int[] num = new int[9];
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
                index = i + 1;
            }
        }
        System.out.println(maxNum);
        System.out.println(index);
    }
}
