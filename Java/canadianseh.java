// Kattis - Canadians, eh?
import java.util.*;

public class canadianseh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input.substring(input.length() - 3, input.length()).equals("eh?")) {
            System.out.println("Canadian!");
        } else {
            System.out.println("Imposter!");
        }

        in.close();
    }
}
