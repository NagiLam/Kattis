// Kattis - Sith
import java.util.*;

class sith {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        if (a > b) {
            System.out.println("VEIT EKKI");
        }

        else if (b > a) {
            if (c < 0) {
                System.out.println("JEDI");
            } else {
                System.out.println("SITH");
            }
        }

        in.close();
    }
}
