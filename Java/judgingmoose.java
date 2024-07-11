// Kattis - Judging Moose
import java.util.*;

class judgingmoose {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();
        if (left == 0 && right == 0) {
            System.out.println("Not a moose");
        }

        else if (left == right) {
            System.out.println("Even " + (left + right));
        }

        else {
            System.out.println("Odd " + Math.max(left, right) * 2);
        }

        in.close();
    }
}
