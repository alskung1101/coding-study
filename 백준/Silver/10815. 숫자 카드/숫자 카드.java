import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int number1;
        int M;
        int number2;
        Map<Integer, Integer> map = new HashMap<>();
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            number1 = scanner.nextInt();
            map.put(number1, 1);
        }
        M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            number2 = scanner.nextInt();
            System.out.print(map.getOrDefault(number2, 0) + " ");
        }

    }

}

