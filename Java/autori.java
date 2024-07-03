// Kattis - Autori
import java.util.*;

class autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        List<Character> shortvar = new ArrayList<>(w);

        shortvar.add(word.charAt(0));
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                shortvar.add(word.charAt(i + 1));
            }
        }

        for (Character character : shortvar) {
            System.out.print(character);
        }
        in.close();
    }
}
