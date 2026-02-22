import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String str;
        for (int i = 0; i < N; i++) {
            str = scanner.nextLine();
            String[] arr = str.split(" ");
            Stack<String> stack = new Stack<>();
            String result = "";
            for (String a : arr) {
                stack.push(a);
            }
            while (!stack.isEmpty()) {
                result += (stack.pop() + " ");
            }
            System.out.println("Case #" + (i + 1) + ": " + result);
            str = "";
            arr = new String[0];
        }
    }


}
