// Kattis - Harshad Numbers
import java.util.*;

class harshadnumbers {

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = 0;
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = num; i < num + 1000; i++) {
            if (i % sumDigits(i) == 0) {
                System.out.println(i);
                break;
            }
        }

        in.close();
    }
}
