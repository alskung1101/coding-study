import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        String word;
        TreeSet<String> tree = new TreeSet<>((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            word = scanner.next();
            tree.add(word);
        }
        for (String t : tree) {
            System.out.println(t);
        }

    }

}

