import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        String[] arr = new String[N + M];
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
            if (i < N) {
                set1.add(arr[i]);
            } else {
                set2.add(arr[i]);
            }
        }
        Set<String> result = new TreeSet<>(set1);
        result.retainAll(set2);
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }

    }

}

