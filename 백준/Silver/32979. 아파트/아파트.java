import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); 
        int T = scanner.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 2 * N; i++) {
            queue.add(scanner.nextInt());
        }
        for (int i = 0; i < T; i++) {
            int b = scanner.nextInt(); 

            for (int h = 0; h < b - 1; h++) {
                queue.add(queue.poll());
            }
            System.out.print(queue.peek() + " ");
        }
    }
}