// Kattis - Á leið í bíó
import java.util.*;

class aleidibio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(c - (a + b));
    }
}
