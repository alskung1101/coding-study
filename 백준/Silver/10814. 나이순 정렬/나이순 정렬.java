import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;


        N = scanner.nextInt();
        Person[] p = new Person[N];
        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            p[i] = new Person(age, name);
        }
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.age - b.age;
            }
        });

        for (Person pp : p) {
            System.out.println(pp.age + " " + pp.name);
        }
    }

}

