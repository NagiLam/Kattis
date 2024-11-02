// Kattis - Quite a Problem
import java.util.*;

public class quiteaproblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String input = in.nextLine().toLowerCase();
            
            if (input.contains("problem")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        in.close();
    }
}
