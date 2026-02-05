import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t;
        int n;
     
        String cloth;
        String type;
        t=scan.nextInt();
        for(int i=0;i<t;i++) {
            n = scan.nextInt();
            int result=1;
            Map<String, Set<String>> clothes = new HashMap<>();
            for (int j = 0; j < n; j++) {
                
                cloth = scan.next();
                type = scan.next();
                if (!clothes.containsKey(type)) {
                    clothes.put(type, new HashSet<>());
                }
                clothes.get(type).add(cloth);
            }
            int keyNum = clothes.size();
            int[] count = new int[keyNum];
            int idx = 0;
            for (String key : clothes.keySet()) {
                count[idx] = clothes.get(key).size();
                idx++;
            }

            if (keyNum == 1) {
                result = count[0];
            } else {
                int multi = 1;
                int sum = 0;
                for (int h = 0; h < keyNum; h++) {

                    result *= (count[h] + 1);
                }
                result-=1;
            }
            System.out.println(result);
        }

    }

}

