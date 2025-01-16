// Kattis - Welcome Sign
import java.util.*;

public class welcomesign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nLines = in.nextInt();
        int nLengths = in.nextInt();
        in.nextLine();
        int index = 0;

        for (int i = 0; i < nLines; i++) {
            String input = in.nextLine();
            if (input.length() == nLengths) {
                System.out.println(input);
                continue;
            }

            int totalPadding = nLengths - input.length();
            int leftPadding = totalPadding / 2;
            int rightPadding = totalPadding / 2;
            
            if (totalPadding % 2 == 0) {
                String print = ".".repeat(leftPadding) + input + ".".repeat(rightPadding);
                System.out.println(print);
                continue;
            }

            index++;
            if (index % 2 == 1) {
                rightPadding++;
            } else {
                leftPadding++;
            }
            String print = ".".repeat(leftPadding) + input + ".".repeat(rightPadding);
            System.out.println(print);
        }

        in.close();
    }
}
