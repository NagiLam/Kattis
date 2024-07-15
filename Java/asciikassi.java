// Kattis - ASCII kassi
import java.util.*;

class asciikassi {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int sideLength = Integer.parseInt(in.nextLine());
        String padding = ("+" + "-".repeat(sideLength) + "+");

        System.out.println(padding);
        for (int i = 0; i < sideLength; i++) {
            System.out.println("|" + " ".repeat(sideLength) + "|");
        }

        System.out.println(padding);
        in.close();
    }
}
