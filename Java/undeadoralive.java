// Kattis - Undead or Alive
import java.util.*;

class undeadoralive {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        if (input.contains(":)") && input.contains(":(")) {
            System.out.println("double agent");
            return;
        }

        if (input.contains(":)")) {
            System.out.println("alive");
            return;
        }

        if (input.contains(":(")) {
            System.out.println("undead");
            return;
        }

        System.out.println("machine");
    }
}
