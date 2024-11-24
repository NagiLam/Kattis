// Kattis - Telja
import java.util.*;

public class telja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        in.close();
    }
}
