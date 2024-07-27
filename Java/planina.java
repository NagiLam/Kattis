// Kattis - Planina
import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = (int) Math.pow(2, n) + 1;
        System.out.println(e * e);
        in.close();
    }
}
