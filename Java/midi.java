// Kattis - Miði
import java.util.*;

public class midi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nNotes = Integer.parseInt(in.nextLine());
        Deque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < nNotes; i++) {
            String input = in.nextLine();
            StringBuilder reversed = new StringBuilder();

            for (int j = input.length() - 1; j >= 0; j--) {
                reversed.append(input.charAt(j));
            }

            deque.addFirst(reversed.toString());
        }

        StringBuilder message = new StringBuilder();
        for (String part : deque) {
            message.append(part);
        }

        System.out.println(message);
        in.close();
    }
}
