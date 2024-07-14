// Kattis - Triple Sevens
import java.util.*;

class triplesevens {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nDigits = in.nextInt();
        int count = 0;

        for (int i = 0; i < 3; i++) {
            int index = 0;
            for (int j = 0; j < nDigits; j++) {
                int a = in.nextInt();
                if (a == 7) {
                    index++;
                }
            }

            if (index != 0) {
                count++;
            }
        }

        System.out.println((count == 3) ? "777" : "0");
        in.close();
    }
}
