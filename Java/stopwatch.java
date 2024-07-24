// Kattis - Stopwatch
import java.util.*;

class stopwatch {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nButtonPressed = Integer.parseInt(in.nextLine());
        int count = 0;
        int[] arraySec = new int[nButtonPressed];

        if (nButtonPressed % 2 != 0) {
            System.out.println("still running");
        } else {
            for (int i = 0; i < nButtonPressed; i++) {
                arraySec[i] = in.nextInt();
            }

            for (int i = 0; i < arraySec.length; i = i + 2) {
                count += arraySec[i + 1] - arraySec[i];
            }

            System.out.println(count);
        }
        in.close();
    }
}
