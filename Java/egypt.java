// Kattis - Egypt
import java.util.*;

public class egypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        in.close();
    }
}
