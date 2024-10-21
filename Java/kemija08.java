// Kattis - Kemija
import java.util.*;

public class kemija08 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
                    || currentChar == 'u') {
                result += currentChar;
                i += 2;
            } else {
                result += currentChar;
            }
        }

        System.out.println(result);
        in.close();
    }
}
