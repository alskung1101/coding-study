import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        String str;
        int score;
        int total=0;
        scanner.nextLine();

        for(int i=0;i<N;i++){

            str=scanner.nextLine();
            score=1;
            total=0;
            for(int h=0;h<str.length();h++){

                if(h>=1){
                    if(str.charAt(h-1)==str.charAt(h)&&str.charAt(h)=='O'){
                        score++;
                        total+=score;
                    }else if(str.charAt(h-1)!=str.charAt(h)&&str.charAt(h)=='O'){
                        score=1;
                        total+=score;
                    }else{

                    }
                }else{
                    if(str.charAt(h)=='O'){
                        total++;
                    }else{

                    }
                }

            }
            System.out.println(total);

        }

    }
}
