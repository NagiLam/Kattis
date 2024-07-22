// Kattis - Heart Rate
import java.util.*;

class heartrate {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nCases; i++) {
            int beats = in.nextInt();
            double pSec = in.nextDouble();
            double calBPM = (60 * beats) / pSec;
            double ABPM = (60 / pSec);

            System.out.printf("%.4f %.4f %.4f%n", calBPM - ABPM, calBPM, calBPM + ABPM);
        }

        in.close();
    }
}
