import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++) {
            String word = sc.next();
            boolean[] seen = new boolean[26];
            boolean ok = true;

            for(int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);

                if(seen[c-'a'] && word.charAt(j-1) != c) {
                    ok = false;
                    break;
                }

                seen[c-'a'] = true;
            }

            if(ok) count++;
        }

        System.out.println(count);
    }
}