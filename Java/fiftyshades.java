// Kattis - Fifty Shades of Pink
import java.util.*;

public class fiftyshades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nButtonPackages = Integer.parseInt(in.nextLine());
        int count = 0;

        for (int i = 0; i < nButtonPackages; i++) {
            String input = in.nextLine().toLowerCase();
            if (input.contains("pink") || input.contains("rose")) {
                count++;
            }
        }

        System.out.println((count != 0) ? count : "I must watch Star Wars with my daughter");
        in.close();
    }
}
