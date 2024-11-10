// Kattis - Some Sum
import java.util.*;

public class somesum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nConsecutiveNumber = Integer.parseInt(in.nextLine());

        if (nConsecutiveNumber % 2 == 1) {
            System.out.println("Either");
        } else {
            if ((nConsecutiveNumber / 2) % 2 == 0) {
                System.out.println("Even");
            }

            else {
                System.out.println("Odd");
            }
        }

        in.close();
    }
}
