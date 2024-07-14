// Kattis - Adding Trouble
import java.util.*;

class addingtrouble {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        System.out.println((A + B == C) ? "correct!" : "wrong!");
        in.close();
    }
}
