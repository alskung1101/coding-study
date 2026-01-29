import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int[] index = new int[26];
        Arrays.fill(index, -1);
        s=scan.nextLine();
        for(int i=0;i<s.length();i++){
            if(index[(int)(s.charAt(i)-'a')]==-1) {
                index[(int) (s.charAt(i) - 'a')]=i;
            }
        }
        for(int i=0;i<index.length;i++){
            System.out.print(index[i] + " ");
        }
    }
}
