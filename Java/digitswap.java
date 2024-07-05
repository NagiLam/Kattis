// Kattis - Digit Swap
import java.util.*;

class digitswap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(s.charAt(1) + "" + s.charAt(0));
        in.close();
    }
}
