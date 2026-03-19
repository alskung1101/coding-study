import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] num = new int[N][M];
        for(int i = 0; i < N; i++){
            for (int h = 0; h < M; h++){
                num[i][h] = scanner.nextInt();
            }
        }

        int K = scanner.nextInt();
        for(int t = 0; t < K; t++){

            int sum = 0;

            int i = scanner.nextInt()-1;
            int j = scanner.nextInt()-1;
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;

            for(int h = i; h <= x; h++){
                for(int g = j; g <= y; g++){
                    sum += num[h][g];
                }
            }
            System.out.println(sum);
        }
    }
}