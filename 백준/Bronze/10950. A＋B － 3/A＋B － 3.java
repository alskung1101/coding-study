import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String[] num = br.readLine().split(" ");

            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);

            System.out.println(a + b);
        }
    }
}
