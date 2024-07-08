// Kattis - Veður - Lokaðar heiðar
import java.util.*;

class vedurheidar {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int windSpeedCurrent = Integer.parseInt(in.nextLine());
        int nRoads = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nRoads; i++) {
            String s = in.next();
            int windSpeedMax = in.nextInt();
            in.nextLine();

            if (windSpeedMax < windSpeedCurrent) {
                System.out.println(s + " lokud");
            } else {
                System.out.println(s + " opin");
            }
        }

        in.close();
    }
}
