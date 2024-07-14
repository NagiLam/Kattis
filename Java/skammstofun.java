// Kattis - Skammstöfun
import java.util.*;

class skammstofun {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nWords = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nWords; i++) {
            String input = in.next();
            if (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
                System.out.print(input.charAt(0));
            }
        }

        in.close();
    }
}
