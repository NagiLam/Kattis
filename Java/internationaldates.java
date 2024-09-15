// Kattis - International Dates
import java.util.*;

public class internationaldates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("/");
        if (Integer.parseInt(input[0]) > 12) {
            System.out.println("EU");
        }

        else if (Integer.parseInt(input[1]) > 12) {
            System.out.println("US");
        }

        else {
            System.out.println("either");
        }

        in.close();
    }
}
