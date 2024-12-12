// Kattis - Run-Length Encoding, Run!
import java.util.*;

public class runlengthencodingrun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        String mode = input[0];
        String encodeString = input[1];
        String result = "";

        if (mode.equals("E")) {
            for (int i = 0; i < encodeString.length(); i++) {
                char index = encodeString.charAt(i);
                int count = 1;

                while (i + 1 < encodeString.length() && encodeString.charAt(i + 1) == index) {
                    count++;
                    i++;
                }
                result += index + String.valueOf(count);
            }

        } else if (mode.equals("D")) {
            for (int i = 0; i < encodeString.length(); i++) {
                char index = encodeString.charAt(i);
                for (int j = 0; j < Integer.parseInt(String.valueOf(encodeString.charAt(i + 1))); j++) {
                    result += index;
                }
                i++;
            }
        }

        System.out.println(result);
        in.close();
    }
}
