// Kattis - Multiplication
import java.math.BigInteger;
import java.util.*;

public class multiplications {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int totalnumber = in.nextInt();
        BigInteger bigResult = BigInteger.ONE;
        BigInteger modValue = BigInteger.valueOf((long) (Math.pow(10, 9) + 7));

        for (int i = 0; i < totalnumber; i++) {
            long number = in.nextLong();
            bigResult = bigResult.multiply(BigInteger.valueOf(number));
        }

        bigResult = bigResult.mod(modValue);
        System.out.println(bigResult);
        in.close();
    }
}
