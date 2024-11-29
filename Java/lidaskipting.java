// Kattis - Liðaskipting
import java.math.BigInteger;
import java.util.*;

public class lidaskipting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger nPeople = in.nextBigInteger();

        if (nPeople.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }

        in.close();
    }
}
