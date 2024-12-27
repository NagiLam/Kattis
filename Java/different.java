// Kattis - A Different Problem
import java.math.BigInteger;
import java.util.*;

public class different {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String input[] = in.nextLine().split(" ");
            BigInteger bigInt1 = new BigInteger(input[0]);
            BigInteger bigInt2 = new BigInteger(input[1]);

            if (bigInt1.compareTo(bigInt2) == 1) {
                System.out.println(bigInt1.subtract(bigInt2));
            } else {
                System.out.println(bigInt2.subtract(bigInt1));
            }
        }

        in.close();
    }
}
