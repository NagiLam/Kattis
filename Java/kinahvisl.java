// Kattis - Kínahvísl
import java.util.*;

class kinahvisl {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String initWord = in.nextLine();
        String finalWord = in.nextLine();
        int count = 1;

        for (int i = 0; i < initWord.length(); i++) {
            if (initWord.charAt(i) != finalWord.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
