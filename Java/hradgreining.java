// Kattis - Hraðgreining
import java.util.*;

class hradgreining {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();

        if (s.contains("cov")) {
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }
        in.close();
    }
}
