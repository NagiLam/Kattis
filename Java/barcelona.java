// Kattis - Barcelona
import java.util.*;

class barcelona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nBags = in.nextInt();
        int benBag = in.nextInt();

        for (int i = 0; i < nBags; i++) {
            int number = in.nextInt();
            if (number == benBag && i == 0) {
                System.out.println("fyrst");
            }

            if (number == benBag && i == 1) {
                System.out.println("naestfyrst");
            }

            if (number == benBag && i >= 2) {
                System.out.println((i + 1) + " fyrst");
            }
        }
        in.close();
    }
}
