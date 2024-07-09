// Kattis - Spavanac
import java.util.*;

class spavanac {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int minutes = in.nextInt();

        if (minutes >= 45) {
            System.out.printf("%d %d%n", hours, minutes - 45);
        } else {
            if (hours >= 1) {
                System.out.printf("%d %d%n", hours - 1, 60 - 45 + minutes);
            } else {
                System.out.printf("%d %d%n", 23, 60 - 45 + minutes);
            }
        }

        in.close();
    }
}
