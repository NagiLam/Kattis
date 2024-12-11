// Kattis - Generalized FizzBuzz
import java.util.*;

public class generalizedfizzbuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        int numberA = in.nextInt();
        int numberB = in.nextInt();

        int countFizz = 0, countBuzz = 0, countFizzBuzz = 0;
        for (int i = 1; i <= numbers; i++) {
            if (i % numberA == 0 && i % numberB == 0) {
                countFizzBuzz++;
            } else if (i % numberA == 0 && i % numberB != 0) {
                countFizz++;
            } else if (i % numberB == 0 && i % numberA != 0) {
                countBuzz++;
            }
        }

        System.out.println(countFizz + " " + countBuzz + " " + countFizzBuzz);
        in.close();
    }
}
