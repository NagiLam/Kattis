// Kattis - Eldspýtur
import java.util.*;

public class eldspytur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nMatches = in.nextInt();
        int maxMatchesPerMove = in.nextInt();

        if (nMatches % (maxMatchesPerMove + 1) == 0) {
            System.out.println("Neibb");
        } else {
            System.out.println("Jebb");
        }

        in.close();
    }
}
