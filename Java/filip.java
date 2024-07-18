// Kattis - Filip
import java.util.*;

class filip {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        StringBuilder first = new StringBuilder(in.next()).reverse();
        StringBuilder second = new StringBuilder(in.next()).reverse();
        int num1 = Integer.parseInt(String.valueOf(first));
        int num2 = Integer.parseInt(String.valueOf(second));

        System.out.println((num1 > num2) ? num1 : num2);
        in.close();
    }
}
