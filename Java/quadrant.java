// Katis - Quadrant Selection
import java.util.*;

class quadrant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x >= 0) {
            if (y >= 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        }

        if (x <= 0) {
            if (y >= 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
        in.close();
    }
}
