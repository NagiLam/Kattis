// Kattis - Simon Says
import java.util.*;

public class simon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            String input = in.nextLine().trim();
            if (input.startsWith("simon says") && input.length() > 11) {
                System.out.println(input.substring(10).trim());
            } else {
                System.out.println();
            }
        }

        in.close();
    }
}
