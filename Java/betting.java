// Kattis - Betting
import java.util.*;

class betting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println((double) 100 / a);
        System.out.println((double) 100 / (100 - a));
        in.close();
    }
}
