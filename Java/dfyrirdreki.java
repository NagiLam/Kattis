// Kattis - D Fyrir Dreki
import java.util.*;

class dfyrirdreki {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        int delta = b * b - (4 * a * c);
        if (delta > 0)
            System.out.println(2);
        if (delta == 0)
            System.out.println(1);
        if (delta < 0)
            System.out.println(0);

        in.close();
    }
}
