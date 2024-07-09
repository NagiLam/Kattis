// Kattis - FizzBuzz
import java.util.*;

class fizzbuzz {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y != 0) {
                System.out.println("Fizz");
                continue;
            }

            if (i % y == 0 && i % x != 0) {
                System.out.println("Buzz");
                continue;
            }

            if (i % x == 0 && i % y == 0) {
                System.out.println("FizzBuzz");
                continue;
            }

            else {
                System.out.println(i);
            }
        }

        in.close();
    }
}
