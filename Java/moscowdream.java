// Kattis - Moscow Dream
import java.util.*;

public class moscowdream {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int easyProblems = in.nextInt();
        int normalProblems = in.nextInt();
        int hardProblems = in.nextInt();
        int totalProblems = in.nextInt();
        boolean conditionFulfill = false;

        if (easyProblems >= 1 && normalProblems >= 1 && hardProblems >= 1) {
            if (easyProblems + normalProblems + hardProblems >= totalProblems && totalProblems >= 3) {
                conditionFulfill = true;
            }
        }
        System.out.println((conditionFulfill) ? "YES" : "NO");
        in.close();
    }
}
