// Kattis - Mergjað Mál
import java.util.*;

public class mergjadmal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input.contains("69") || input.contains("420")) {
            System.out.println("Mergjad!");
        } else {
            System.out.println("Leim!");
        }

        in.close();
    }
}
