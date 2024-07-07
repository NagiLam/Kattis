// Kattis - Fjöldi Bókstafa
import java.util.*;

class fjoldibokstafa {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        long count = word.chars()
                .filter(ch -> (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                .count();

        System.out.println(count);
        in.close();
    }
}
