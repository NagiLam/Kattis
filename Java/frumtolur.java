// Kattis - Frumtölur
import java.util.*;

public class frumtolur {
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> primeList = new ArrayList<>();

        for (int i = 0; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeList.add(i);
            }

            if (primeList.size() == 100) {
                break;
            }
        }

        in.close();
    }
}
