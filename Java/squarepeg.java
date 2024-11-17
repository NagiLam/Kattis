// Kattis - Square Peg
import java.util.*;

public class squarepeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sideLengthL = in.nextInt();
        int radiusR = in.nextInt();

        if (sideLengthL <= radiusR * Math.sqrt(2)) {
            System.out.println("fits");
        } else {
            System.out.println("nope");
        }

        in.close();
    }
}
