import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] total = new int[5];
        int[][] score = new int[5][4];
        int max = 0;
        int number = 0;
        for (int i = 0; i < score.length; i++) {
            for (int h = 0; h < score[i].length; h++) {
                score[i][h] = scanner.nextInt();
                total[i] += score[i][h];
            }
        }
        for (int i = 0; i < total.length; i++) {
            if (max < total[i]) {
                max = total[i];
                number = i + 1;
            }
        }
        System.out.println(number + " " + max);


    }
}
