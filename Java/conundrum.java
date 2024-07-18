// Kattis - Cryptographer's Conundrum
import java.util.*;

class conundrum {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase();
        int count = 0;

        for (int i = 0; i < input.length(); i = i + 3) {
            String temp = input.substring(i, i + 3);
            if (temp.charAt(0) != 'P') {
                count++;
            }

            if (temp.charAt(1) != 'E') {
                count++;
            }

            if (temp.charAt(2) != 'R') {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
