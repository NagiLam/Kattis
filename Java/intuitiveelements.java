// Kattis - Intuitive Elements
import java.util.*;

public class intuitiveelements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            String fullword = in.nextLine().toLowerCase();
            String abbreviation = in.nextLine().toLowerCase();
            boolean result = false;

            for (int j = 0; j < abbreviation.length(); j++) {
                if (fullword.contains(String.valueOf(abbreviation.charAt(j)))) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }

            System.out.println((result) ? "YES" : "NO");
        }

        in.close();
    }
}
