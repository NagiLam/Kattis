// Kattis - Sort Two Numbers
import java.util.*;

class sorttwonumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println((a > b) ? b + " " + a : a + " " + b);
        in.close();
    }
}
