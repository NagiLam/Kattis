// Kattis - Fyrirtækjanafn
import java.util.*;

public class fyrirtaekjanafn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder input = new StringBuilder(in.nextLine());

        Set<Character> vowels = new HashSet<>(
                Arrays.asList('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y'));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            if (vowels.contains(index)) {
                result.append(index);
            }
        }

        System.out.println(result);
        in.close();
    }
}
