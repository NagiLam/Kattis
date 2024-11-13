// Kattis - Which Number Kind Is It?
import java.util.*;

public class whichnumberkindisit2 {

    private static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            int number = Integer.parseInt(in.nextLine());
            boolean isOdd = (number % 2 != 0);
            boolean isPerfectSquare = isPerfectSquare(number);

            if (isOdd) {
                System.out.print("O");
            }

            if (isPerfectSquare) {
                System.out.print("S");
            }

            if (!isOdd && !isPerfectSquare) {
                System.out.print("EMPTY");
            }

            System.out.println();
        }

        in.close();
    }
}
