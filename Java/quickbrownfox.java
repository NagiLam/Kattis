// Kattis - Quick Brown Fox
import java.util.*;

public class quickbrownfox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int nPhrase = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nPhrase; i++) {
            String input = in.nextLine().toLowerCase();
            Set<Character> missingLetters = new HashSet<>();

            for (char ch : alphabet.toCharArray()) {
                missingLetters.add(ch);
            }
            for (char ch : input.toCharArray()) {
                missingLetters.remove(ch);
            }

            if (missingLetters.isEmpty()) {
                System.out.println("pangram");
            } else {
                StringBuilder missing = new StringBuilder();
                for (char ch : missingLetters) {
                    missing.append(ch);
                }
                System.out.println("missing " + missing.toString());
            }
        }

        in.close();
    }
}
