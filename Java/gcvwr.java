// Kattis - GCVWR
import java.util.*;

class gcvwr {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int gcvwrLbs = in.nextInt();
        int truckLbs = in.nextInt();
        int nItems = in.nextInt();
        int sumLbs = 0;

        for (int i = 0; i < nItems; i++) {
            sumLbs += in.nextInt();
        }

        int weightTrailerMax = (gcvwrLbs - truckLbs) * 90 / 100;
        System.out.println(weightTrailerMax - sumLbs);

        in.close();
    }
}
