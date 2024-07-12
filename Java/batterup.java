// Kattis - Batter Up
import java.util.*;

class batterup {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nAtBats = Integer.parseInt(in.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nAtBats; i++) {
            int num = in.nextInt();
            if (num < 0) {
                count++;
            }

            else {
                sum += num;
            }
        }

        System.out.println((double) sum / (nAtBats - count));
        in.close();
    }
}
