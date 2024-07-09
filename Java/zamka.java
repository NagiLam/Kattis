// Kattis - Zamka
import java.util.*;

class zamka {
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int L = Integer.parseInt(in.nextLine());
        int D = Integer.parseInt(in.nextLine());
        int X = Integer.parseInt(in.nextLine());

        for (int i = L; i <= D; i++) {
            if (sumDigits(i) == X) {
                System.out.println(i);
                break;
            }
        }

        for (int j = D; j >= L; j--) {
            if (sumDigits(j) == X) {
                System.out.println(j);
                break;
            }
        }

        in.close();
    }
}
