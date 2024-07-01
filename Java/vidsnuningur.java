// Kattis - Viðsnúningur 
import java.util.*;

class vidsnuningur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        // First approach: Using for loop to traverse
        // the string and print each character in reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        // Second approach: Using StringBuilder reverse() method
        /*
         * StringBuilder sReverse = new StringBuilder();
         * sReverse.append(s);
         * sReverse.reverse();
         * System.out.println(sReverse);
         */
    }
}
