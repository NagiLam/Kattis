// Kattis - Heysáta
import java.util.*;

public class heysata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nChar = Integer.parseInt(in.nextLine());
        char needle = in.nextLine().charAt(0);
        String haystack = in.nextLine();

        if (haystack.contains(String.valueOf(needle))) {
            System.out.println("Unnar fann hana!");
        } else {
            System.out.println("Unnar fann hana ekki!");
        }

        in.close();
    }
}
