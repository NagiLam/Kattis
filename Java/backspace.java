// Kattis - Backspace
import java.util.*;

public class backspace {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '<') {
                charList.add(input.charAt(i));
            } else if (!charList.isEmpty()) {
                charList.remove(charList.size() - 1);
            }
        }

        StringBuilder output = new StringBuilder();
        for (char c : charList) {
            output.append(c);
        }

        System.out.println(output.toString());
        in.close();
    }
}
