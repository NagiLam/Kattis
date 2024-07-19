// Kattis - Stand on Zanzibar
import java.util.*;

class zanzibar {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            int count = 0;
            int prev = in.nextInt();
            int current = in.nextInt();
            while (current > 0) {
                if (current - (prev * 2) > 0) {
                    count += current - (prev * 2);
                }
                prev = current;
                current = in.nextInt();
            }
            System.out.println(count);
        }

        in.close();
    }
}
