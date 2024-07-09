// Kattis - Greetings!
import java.util.*;

class greetings2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        long count = word.chars().filter(ch -> ch == 'e').count();

        System.out.println(word.charAt(0) + "e".repeat((int) count * 2) + word.charAt(word.length() - 1));
        in.close();
    }
}
