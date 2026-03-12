import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int N = scanner.nextInt();
        int[][] cow = new int[N][2];
        for (int i = 0; i < N; i++) {
            cow[i][0] = scanner.nextInt();
            cow[i][1] = scanner.nextInt();
            if (map.containsKey(cow[i][0])) {
                if (cow[i][1] != map.get(cow[i][0])) {
                    count++;
                    map.put(cow[i][0], cow[i][1]);
                }

            } else {
                map.put(cow[i][0], cow[i][1]);
            }
        }
        System.out.println(count);

    }
}
