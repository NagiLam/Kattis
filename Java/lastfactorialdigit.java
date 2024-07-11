// Kattis - Last Factorial Digit
import java.util.*;

class lastfactorialdigit {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            int num = in.nextInt();
            int factor = 1;
            for (int j = 1; j <= num; j++) {
                factor *= j;
            }
            System.out.println(factor % 10);
        }

        in.close();
    }
}
