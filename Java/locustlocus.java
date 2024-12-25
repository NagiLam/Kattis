// Kattis - Locust Locus
import java.util.*;

public class locustlocus {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nPairs = Integer.parseInt(in.nextLine());
        int earliestYear = Integer.MAX_VALUE;

        for (int i = 0; i < nPairs; i++) {
            int yearObserved = in.nextInt();
            int firstSpeciesCycleLength = in.nextInt();
            int secondSpeciesCycleLength = in.nextInt();

            int lcm = lcm(firstSpeciesCycleLength, secondSpeciesCycleLength);
            int nextYear = yearObserved + lcm;
            earliestYear = Math.min(earliestYear, nextYear);
        }

        System.out.println(earliestYear);
        in.close();
    }
}
