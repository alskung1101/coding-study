import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] discardedCards = new int[N - 1];
        int remainingCards;
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (!(queue.size() == 1)) {
            discardedCards[index++] = queue.poll();
            queue.add(queue.poll());
        }
        remainingCards = queue.peek();
        for (int dis : discardedCards) {
            System.out.print(dis + " ");
        }
        System.out.print(remainingCards);
    }


}
